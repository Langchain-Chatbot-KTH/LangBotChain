package com.dev.langbotchain.langchain4j.spring.Generation.Stream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.ModelList;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.model.StreamingResponseHandler;
import dev.langchain4j.model.output.Response;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.TokenStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.testcontainers.containers.GenericContainer;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

import static com.dev.langbotchain.langchain4j.spring.Config.ContainerConfig.ContainerConfig.createContainer;
import static com.dev.langbotchain.langchain4j.spring.Config.ContainerConfig.ContainerConfig.isContainerRunning;
import static com.dev.langbotchain.langchain4j.spring.Generation.Stream.InitializeStreamByModel.initializeModel;

@Component
public class StreamGeneration {

    interface Assistant { TokenStream chat(String message);}

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;

    @Autowired
    public StreamGeneration(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    public void GenerateStream(String question, String modelName, String uuid) {

        Model modelObject = ModelList.findModelByName(modelName);
        if(!isContainerRunning(modelObject.getLangchain4JDockerPath())){
            GenericContainer<?>  model = createContainer(modelObject.getLangchain4JDockerPath());
            assert model != null;
            model.start();
        }

        CompletableFuture<Response<AiMessage>> futureResponse = new CompletableFuture<>();

        Assistant assistant = AiServices.create(Assistant.class, initializeModel(modelObject));

        TokenStream tokenStream = assistant.chat(question);

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
