package com.dev.langbotchain.langchain4j.ollama.spring.TextGeneration;

import com.dev.langbotchain.langchain4j.ollama.spring.Agents.GeneralAgent;
import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.loader.FileSystemDocumentLoader;
import dev.langchain4j.data.document.loader.UrlDocumentLoader;
import dev.langchain4j.data.document.parser.TextDocumentParser;
import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.rag.content.retriever.ContentRetriever;
import dev.langchain4j.service.AiServices;

import org.springframework.stereotype.Component;
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

import javax.print.Doc;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.time.Duration;


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

    public String GenerateTextLlama2Docs(String question) {

        if(!llama2.isRunning()){
            llama2.start();
            initializeOllamaDocRetriever();
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

    void initializeOllamaTextAssistant() {
        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);

        ChatLanguageModel OllamaModel = initializeModel();
        assistant = AiServices.builder(GeneralAgent.class)
                .chatLanguageModel(OllamaModel)
                .chatMemory(chatMemory)
                .build();

        System.out.println("Ollama Text assistant init OK");

    }

    void initializeOllamaDocRetriever() {
        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);

        ChatLanguageModel OllamaModel = initializeModel();

        // Now, let's load a document that we want to use for RAG.
        // We will use the terms of use from an imaginary car rental company, "Miles of Smiles".
        // For this example, we'll import only a single document, but you can load as many as you need.
        // LangChain4j offers built-in support for loading documents from various sources:
        // File System, URL, Amazon S3, Azure Blob Storage, GitHub, Tencent COS.
        // Additionally, LangChain4j supports parsing multiple document types:
        // text, pdf, doc, xls, ppt.
        // However, you can also manually import your data from other sources.
        Path documentPath = Paths.get("E:\\Github-Projects\\LangBotChain\\src\\main\\resources\\randomTermsOfUse.txt");
        DocumentParser documentParser = new TextDocumentParser();

        //Document document = FileSystemDocumentLoader.loadDocument(documentPath, documentParser);

        Document document = UrlDocumentLoader.load("https://sv.wikipedia.org/wiki/Katarina_Howard", documentParser);


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


        // The final step is to build our AI Service,
        // configuring it to use the components we've created above.



        assistant = AiServices.builder(GeneralAgent.class)
                .chatLanguageModel(OllamaModel)
                .contentRetriever(contentRetriever)
                .chatMemory(chatMemory)
                .build();

        System.out.println("Content retriever ");

    }

    private String chat(String message) {
        return assistant.chat(message);
    }

    //i am not sure why this cant find the filepath, hardcoding it in the intializer for this push
    static Path toPath(String fileName) {
        try {
            URL fileUrl = LlamaTextGeneration.class.getResource(fileName);
            return Paths.get(fileUrl.toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }




}

