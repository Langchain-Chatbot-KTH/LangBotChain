package com.dev.langbotchain.langchain4j.spring.Generation.Stream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.ModelList;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.model.StreamingResponseHandler;
import dev.langchain4j.model.output.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.shaded.org.checkerframework.checker.units.qual.A;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static com.dev.langbotchain.langchain4j.spring.Config.ContainerConfig.ContainerConfig.createContainer;
import static com.dev.langbotchain.langchain4j.spring.Config.ContainerConfig.ContainerConfig.isContainerRunning;

@Component
public class StreamGeneration {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;

    @Autowired
    public StreamGeneration(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    public void GenerateStream(String question, OutputStream outputStream, String modelName, String uuid) {

        Model modelObject = ModelList.findModelByName(modelName);
        if(!isContainerRunning(modelObject.getLangchain4JDockerPath())){
            GenericContainer<?>  model = createContainer(modelObject.getLangchain4JDockerPath());
            model.start();
        }

        CompletableFuture<Response<AiMessage>> futureResponse = new CompletableFuture<>();
        InitializeStreamByModel.initializeModel(modelObject).generate(question, new StreamingResponseHandler<AiMessage>() {
            @Override
            public void onNext(String token) {
                try {
                    System.out.println("Token " + token); // Test
                    String jsonMessageResponse = objectMapper.writeValueAsString(Map.of(
                            "message", token,
                            "uuid", uuid
                    ));
                    kafkaTemplate.send("answers", jsonMessageResponse);
//                    outputStream.write(token.getBytes());
//                    outputStream.flush();
                } catch (IOException e) {
                    futureResponse.completeExceptionally(e);
                }
            }

            @Override
            public void onComplete(Response<AiMessage> response) {
                futureResponse.complete(response);
            }

            @Override
            public void onError(Throwable error) {
                futureResponse.completeExceptionally(error);
            }
        });
        futureResponse.join();
    }
}
