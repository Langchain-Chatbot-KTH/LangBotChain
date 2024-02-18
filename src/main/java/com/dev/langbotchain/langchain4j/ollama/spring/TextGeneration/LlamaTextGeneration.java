package com.dev.langbotchain.langchain4j.ollama.spring.TextGeneration;

import com.dev.langbotchain.langchain4j.ollama.spring.Agents.GeneralAgent;
import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.loader.UrlDocumentLoader;
import dev.langchain4j.data.document.parser.TextDocumentParser;
import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.rag.content.retriever.ContentRetriever;
import dev.langchain4j.service.AiServices;

import org.apache.commons.compress.utils.FileNameUtils;
import org.jsoup.UnsupportedMimeTypeException;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.UnsupportedMediaTypeStatusException;
import org.testcontainers.containers.GenericContainer;


import dev.langchain4j.data.document.DocumentParser;
import dev.langchain4j.data.document.DocumentSplitter;

import dev.langchain4j.data.document.splitter.DocumentSplitters;
import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.model.embedding.AllMiniLmL6V2EmbeddingModel;
import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.rag.content.retriever.EmbeddingStoreContentRetriever;
import dev.langchain4j.store.embedding.EmbeddingStore;
import dev.langchain4j.store.embedding.inmemory.InMemoryEmbeddingStore;


import dev.langchain4j.data.document.parser.apache.pdfbox.ApachePdfBoxDocumentParser;
import org.testcontainers.shaded.org.apache.commons.io.FilenameUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.time.Duration;
import java.util.Optional;

import static dev.langchain4j.data.document.loader.FileSystemDocumentLoader.loadDocument;



@Component
public class LlamaTextGeneration {
    GenericContainer<?> llama2 = new GenericContainer<>("langchain4j/ollama-" + "llama2" + ":latest")
            .withExposedPorts(11434);

    private GeneralAgent assistant;

    public String GenerateTextLlama2(String question) {

        if(!llama2.isRunning()){
            llama2.start();
            initializeOllamaTextAssistant();
        }
        String answer = String.valueOf(chat(question));
        return answer;
    }

    public String generateTextWithDocumentLlama2(String question, MultipartFile document) throws IOException {

        if(!llama2.isRunning()){
            llama2.start();
            initializeTextWithDocumentlLlama2(document);
        }
        String answer = String.valueOf(chat(question));
        return answer;
    }

    public String generateTextWithUrlLlama2(String question, String UrlPath) {
        if(!llama2.isRunning()){
            llama2.start();
            initializeTextWithUrlLlama2(UrlPath);
        }
        String answer = String.valueOf(chat(question));
        return answer;
    }

    private ChatLanguageModel initializeModel(){
        String baseUrl = String.format("http://%s:%d", llama2.getHost(), llama2.getFirstMappedPort());

        ChatLanguageModel model = OllamaChatModel.builder()
                .baseUrl(baseUrl)
                .modelName("llama2")
                .timeout(Duration.ofMinutes(2))
                .maxRetries(3)
                .build();
        return model;
    }

    //This method only supports pdf and txt parser atm.
    private DocumentParser createDocumentParser(MultipartFile userDocument) throws UnsupportedOperationException {
       if (userDocument != null) {
            String extension = FilenameUtils.getExtension(userDocument.getOriginalFilename());

            switch (extension) {
                case "pdf":
                    return new ApachePdfBoxDocumentParser();
                case "txt":
                    return new TextDocumentParser();
                default:
                    throw new UnsupportedOperationException("Not supporting this filetype: " + extension);
            }
        } else {
            throw new IllegalArgumentException("Both userDocument cannot be null");
        }
    }

    //This method is a simple "RAG" retriever, embeddingmodel and embeddingstore should be researched
    private ContentRetriever createContentRetriever(Document document) {
        // Example code from https://github.com/langchain4j/langchain4j-examples/blob/main/rag-examples/src/main/java/_01_Naive_RAG.java

        // Now, we need to split this document into smaller segments, also known as "chunks."
        // This approach allows us to send only relevant segments to the LLM in response to a user query,
        // rather than the entire document. For instance, if a user asks about cancellation policies,
        // we will identify and send only those segments related to cancellation.
        // A good starting point is to use a recursive document splitter that initially attempts
        // to split by paragraphs. If a paragraph is too large to fit into a single segment,
        // the splitter will recursively divide it by newlines, then by sentences, and finally by words,
        // if necessary, to ensure each piece of text fits into a single segment.
        DocumentSplitter splitter = DocumentSplitters.recursive(300, 0);
        List<TextSegment> segments = splitter.split(document);

        // Now, we need to embed (also known as "vectorize") these segments.
        // Embedding is needed for performing similarity searches.
        // For this example, we'll use a local in-process embedding model, but you can choose any supported model.
        // Langchain4j currently supports more than 10 popular embedding model providers.
        EmbeddingModel embeddingModel = new AllMiniLmL6V2EmbeddingModel();
        List<Embedding> embeddings = embeddingModel.embedAll(segments).content();

        // Next, we will store these embeddings in an embedding store (also known as a "vector database").
        // This store will be used to search for relevant segments during each interaction with the LLM.
        // For simplicity, this example uses an in-memory embedding store, but you can choose from any supported store.
        // Langchain4j currently supports more than 15 popular embedding stores.
        EmbeddingStore<TextSegment> embeddingStore = new InMemoryEmbeddingStore<>();
        embeddingStore.addAll(embeddings, segments);


        // The content retriever is responsible for retrieving relevant content based on a user query.
        // Currently, it is capable of retrieving text segments, but future enhancements will include support for
        // additional modalities like images, audio, and more.
        ContentRetriever contentRetriever = EmbeddingStoreContentRetriever.builder()
                .embeddingStore(embeddingStore)
                .embeddingModel(embeddingModel)
                .maxResults(2) // on each interaction we will retrieve the 2 most relevant segments
                .minScore(0.5) // we want to retrieve segments at least somewhat similar to user query
                .build();
        // Optionally, we can use a chat memory, enabling back-and-forth conversation with the LLM
        // and allowing it to remember previous interactions.
        // Currently, LangChain4j offers two chat memory implementations:
        // MessageWindowChatMemory and TokenWindowChatMemory.

        return contentRetriever;
    }

    void initializeOllamaTextAssistant() {
        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);

        ChatLanguageModel OllamaModel = initializeModel();
        assistant = AiServices.builder(GeneralAgent.class)
                .chatLanguageModel(OllamaModel)
                .chatMemory(chatMemory)
                .build();

        System.out.println("Ollama Text assistant init OK");
    }

    void initializeTextWithUrlLlama2(String UrlPath) {
        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);
        ChatLanguageModel OllamaModel = initializeModel();
        DocumentParser documentParser = new TextDocumentParser();
        Document document = UrlDocumentLoader.load(UrlPath, documentParser);


        ContentRetriever contentRetriever = createContentRetriever(document);

        assistant = AiServices.builder(GeneralAgent.class)
                .chatLanguageModel(OllamaModel)
                .contentRetriever(contentRetriever)
                .chatMemory(chatMemory)
                .build();

        System.out.println("Assistant with URL is loaded");
    }

    void initializeTextWithDocumentlLlama2(MultipartFile userDocument) throws IOException {
        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);
        ChatLanguageModel OllamaModel = initializeModel();

        DocumentParser documentParser = createDocumentParser(userDocument);

        //This parses the Multipartfile from the request to a Document which is needed for the langchain4j splitter
        InputStream fileInputStream = userDocument.getInputStream();
        Document document = documentParser.parse(fileInputStream);
        fileInputStream.close();

        ContentRetriever contentRetriever = createContentRetriever(document);

        // The final step is to build our AI Service,
        // configuring it to use the components we've created above.

        assistant = AiServices.builder(GeneralAgent.class)
                .chatLanguageModel(OllamaModel)
                .contentRetriever(contentRetriever)
                .chatMemory(chatMemory)
                .build();

        System.out.println("Assistant with document is loaded");
    }

    private String chat(String message) {
        return assistant.chat(message);
    }

    static Path toPath(String fileName) {
        try {
            URL fileUrl = LlamaTextGeneration.class.getResource(fileName);
            return Paths.get(fileUrl.toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }




}

