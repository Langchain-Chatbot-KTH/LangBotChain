package com.dev.langbotchain.langchain4j.spring.Generation.Embedding;


import com.dev.langbotchain.langchain4j.spring.Generation.Agents.GeneralAgent;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.ModelList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.langchain4j.data.message.AiMessage;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.embedding.AllMiniLmL6V2EmbeddingModel;
import dev.langchain4j.model.embedding.EmbeddingModel;

import dev.langchain4j.model.embedding.bge.small.en.v15.BgeSmallEnV15QuantizedEmbeddingModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.model.output.Response;
import dev.langchain4j.rag.content.retriever.ContentRetriever;
import dev.langchain4j.rag.content.retriever.EmbeddingStoreContentRetriever;
import dev.langchain4j.rag.content.retriever.neo4j.Neo4jContentRetriever;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.TokenStream;
import dev.langchain4j.service.UserMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static com.dev.langbotchain.langchain4j.spring.Config.OllamaServerConfig.OllamaServerCheck.baseUrl;
import static com.dev.langbotchain.langchain4j.spring.Config.OllamaServerConfig.OllamaServerCheck.checkOllamaServerAndInitializeModel;
import static com.dev.langbotchain.langchain4j.spring.Generation.Embedding.InitializeNeo4j.initializeNeo4j;
import static com.dev.langbotchain.langchain4j.spring.Generation.Embedding.InitializeNeo4j.initializeNeo4jGraph;
import static com.dev.langbotchain.langchain4j.spring.Generation.Stream.InitializeStreamByModel.initializeModel;
import static com.dev.langbotchain.langchain4j.spring.ModelMemory.InitModelMemory.initModelMemory;

@Component
public class EmbeddingGeneration {
    private final ObjectMapper objectMapper;
    private final KafkaTemplate<String, String> kafkaTemplate;

    interface GeneralStreamAssistant{
        TokenStream chat(@MemoryId int memoryId, @UserMessage String userMessage);
    }
    @Autowired
    public EmbeddingGeneration(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    public void generateEmbedding(String question, String modelName, String uuid, int id){

        Model modelObject = ModelList.findModelByName(modelName);
        checkOllamaServerAndInitializeModel(modelObject);

        CompletableFuture<Response<AiMessage>> futureResponse = new CompletableFuture<>();

        ChatLanguageModel model = OllamaChatModel.builder()
                .baseUrl(baseUrl)
                .modelName(modelObject.getName())
                .timeout(Duration.ofMinutes(2))
                .maxRetries(3)
                .build();

        Neo4jContentRetriever contentRetrieverNeo4j = Neo4jContentRetriever.builder()
                .graph(initializeNeo4jGraph())
                .chatLanguageModel(model)
                .build();

        EmbeddingModel embeddingModel = new BgeSmallEnV15QuantizedEmbeddingModel();
        //EmbeddingModel embeddingModel = new AllMiniLmL6V2EmbeddingModel();

        //ContentRetriever contentRetriever = EmbeddingStoreContentRetriever.builder()
          //      .embeddingStore(initializeNeo4j())
            //    .embeddingModel(embeddingModel)
              //  .maxResults(2)
                //.minScore(0.6)
                //.build();


        GeneralStreamAssistant assistant = AiServices.builder(GeneralStreamAssistant.class)
                .streamingChatLanguageModel(initializeModel(modelObject))
                .chatMemoryProvider(initModelMemory())
                .contentRetriever(contentRetrieverNeo4j)
                .build();

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
}
