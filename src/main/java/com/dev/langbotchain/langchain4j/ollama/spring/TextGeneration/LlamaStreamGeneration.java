package com.dev.langbotchain.langchain4j.ollama.spring.TextGeneration;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.model.StreamingResponseHandler;
import dev.langchain4j.model.chat.StreamingChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaStreamingChatModel;
import dev.langchain4j.model.output.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.shaded.org.checkerframework.checker.units.qual.A;

import java.io.IOException;
import java.io.OutputStream;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@Component
public class LlamaStreamGeneration {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;

    @Autowired
    public LlamaStreamGeneration(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    GenericContainer<?> llama2 = new GenericContainer<>("langchain4j/ollama-" + "llama2" + ":latest")
            .withExposedPorts(11434);

    public void GenerateStreamLlama2(String question, OutputStream outputStream, String uuid) {
        if(!llama2.isRunning()){
            llama2.start();
        }

        CompletableFuture<Response<AiMessage>> futureResponse = new CompletableFuture<>();
        initializeModel().generate(question, new StreamingResponseHandler<AiMessage>() {
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

    private StreamingChatLanguageModel initializeModel() {
        String baseUrl = String.format("http://%s:%d", llama2.getHost(), llama2.getFirstMappedPort());

        StreamingChatLanguageModel model = OllamaStreamingChatModel.builder()
                .baseUrl(baseUrl)
                .modelName("llama2")
                .timeout(Duration.ofMinutes(2))
                .build();
        return model;
    }
}
