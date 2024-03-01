package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.DocsAnalyzer;

import com.dev.langbotchain.langchain4j.spring.Generation.Agents.GeneralAgent;
import com.dev.langbotchain.langchain4j.spring.Generation.Agents.GeneralStreamAssistant;
import com.dev.langbotchain.langchain4j.spring.Generation.Stream.InitializeStreamByModel;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.ModelList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.DocumentParser;
import dev.langchain4j.data.document.DocumentSplitter;
import dev.langchain4j.data.document.parser.TextDocumentParser;
import dev.langchain4j.data.document.parser.apache.pdfbox.ApachePdfBoxDocumentParser;
import dev.langchain4j.data.document.splitter.DocumentSplitters;
import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.embedding.AllMiniLmL6V2EmbeddingModel;
import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.model.output.Response;
import dev.langchain4j.rag.content.retriever.ContentRetriever;
import dev.langchain4j.retriever.EmbeddingStoreRetriever;
import dev.langchain4j.retriever.Retriever;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.TokenStream;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.store.embedding.EmbeddingStore;
import dev.langchain4j.store.embedding.inmemory.InMemoryEmbeddingStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.testcontainers.shaded.org.apache.commons.io.FilenameUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static com.dev.langbotchain.langchain4j.spring.Config.OllamaServerConfig.OllamaServerCheck.checkOllamaServerAndInitializeModel;
import static com.dev.langbotchain.langchain4j.spring.Generation.ContentRetriver.ContentRetriverObject.createContentRetriever;
import static com.dev.langbotchain.langchain4j.spring.ModelMemory.InitModelMemory.initModelMemory;

@Component
public class DocumentToTextGenerationAnalyzer {
    private static GeneralStreamAssistant assistant;

    interface GeneralStreamAssistant{
        TokenStream chat(@MemoryId int memoryId, @UserMessage String userMessage);
    }
    private static KafkaTemplate<String, String> kafkaTemplate = null;
    private static ObjectMapper objectMapper = null;

    @Autowired
    public DocumentToTextGenerationAnalyzer(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        DocumentToTextGenerationAnalyzer.kafkaTemplate = kafkaTemplate;
        DocumentToTextGenerationAnalyzer.objectMapper = objectMapper;
    }

    public static void generateTextWithDocumentAnalyzer(String question, MultipartFile document, String modelName, String uuid, int id) throws IOException {
        Model modelObject = ModelList.findModelByName(modelName);
        checkOllamaServerAndInitializeModel(modelObject);
        initializeTokenStreamWithDocument(document, modelObject);

        CompletableFuture<Response<AiMessage>> futureResponse = new CompletableFuture<>();

        TokenStream tokenStream = assistant.chat(id, question);

        tokenStream.onNext(token -> {
                    try {
                        String jsonMessageResponse = objectMapper.writeValueAsString(Map.of(
                                "message", token,
                                "uuid", uuid
                        ));
                        kafkaTemplate.send("answers", jsonMessageResponse);
                    } catch (IOException e) {
                        futureResponse.completeExceptionally(e);
                    }
                })
                .onComplete(response -> {
                    try {
                        String jsonMessageResponse = objectMapper.writeValueAsString(Map.of(
                                "message", "#FC9123CFAA1953123#",
                                "uuid", uuid
                        ));
                        kafkaTemplate.send("answers", jsonMessageResponse);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                    futureResponse.complete(response);
                })
                .onError(Throwable::printStackTrace)
                .start();

        futureResponse.join();
    }

    private static DocumentParser createDocumentParser(MultipartFile userDocument) throws UnsupportedOperationException {
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

    static void initializeTokenStreamWithDocument(MultipartFile userDocument, Model model) throws IOException {
        if(assistant != null) { return; }
        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);

        DocumentParser documentParser = createDocumentParser(userDocument);

        //This parses the Multipartfile from the request to a Document which is needed for the langchain4j splitter
        InputStream fileInputStream = userDocument.getInputStream();
        Document document = documentParser.parse(fileInputStream);
        fileInputStream.close();

        ContentRetriever contentRetriever = createContentRetriever(document);


        // The final step is to build our AI Service,
        // configuring it to use the components we've created above.

        assistant = AiServices.builder(GeneralStreamAssistant.class)
                .streamingChatLanguageModel(InitializeStreamByModel.initializeModel(model))
                //.contentRetriever(contentRetriever)
                .retriever(retriever(document))
                .chatMemoryProvider(initModelMemory())
                .build();
    }

    private static Retriever<TextSegment> retriever(Document document){
        EmbeddingModel embeddingModel = new AllMiniLmL6V2EmbeddingModel();
        EmbeddingStore<TextSegment> embeddingStore = new InMemoryEmbeddingStore<>();

        DocumentSplitter splitter = DocumentSplitters.recursive(300, 0);
        List<TextSegment> segments = splitter.split(document);

        List<Embedding> embeddings = embeddingModel.embedAll(segments).content();
        embeddingStore.addAll(embeddings, segments);



        return EmbeddingStoreRetriever.from(embeddingStore, embeddingModel, 1, 0.6);
    }
}
