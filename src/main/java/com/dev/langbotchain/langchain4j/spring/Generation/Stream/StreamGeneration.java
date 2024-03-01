package com.dev.langbotchain.langchain4j.spring.Generation.Stream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.ModelList;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import dev.langchain4j.data.message.AiMessage;

import dev.langchain4j.model.output.Response;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.TokenStream;
import dev.langchain4j.service.UserMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static com.dev.langbotchain.langchain4j.spring.Config.OllamaServerConfig.OllamaServerCheck.checkOllamaServerAndInitializeModel;
import static com.dev.langbotchain.langchain4j.spring.Generation.Stream.InitializeStreamByModel.initializeModel;
import static com.dev.langbotchain.langchain4j.spring.ModelMemory.InitModelMemory.initModelMemory;


@Component
public class StreamGeneration {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;
    private GeneralStreamAssistant assistant;
    interface GeneralStreamAssistant{
        TokenStream chat(@MemoryId int memoryId, @UserMessage String userMessage);
    }

    @Autowired
    public StreamGeneration(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }
    public String GenerateStream(String question, String modelName, String uuid, int id) {

        Model modelObject = ModelList.findModelByName(modelName);
        checkOllamaServerAndInitializeModel(modelObject);

        CompletableFuture<Response<AiMessage>> futureResponse = new CompletableFuture<>();

        assistant = AiServices.builder(GeneralStreamAssistant.class)
                .streamingChatLanguageModel(initializeModel(modelObject))
                .chatMemoryProvider(initModelMemory())
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
        return "running";
    }
}
