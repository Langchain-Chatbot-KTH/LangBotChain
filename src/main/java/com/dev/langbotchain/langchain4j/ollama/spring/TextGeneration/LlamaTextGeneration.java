package com.dev.langbotchain.langchain4j.ollama.spring.TextGeneration;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import org.springframework.stereotype.Component;
import org.testcontainers.containers.GenericContainer;

import java.time.Duration;

@Component
public class LlamaTextGeneration {
    GenericContainer<?> llama2 = new GenericContainer<>("langchain4j/ollama-" + "llama2" + ":latest")
            .withExposedPorts(11434);
    public String GenerateTextLlama2(String question) {

        if(!llama2.isRunning()){
            llama2.start();
        }
        String answer = String.valueOf(initializeModel().generate(question));
        return answer;
    }

    public ChatLanguageModel initializeModel(){
        String baseUrl = String.format("http://%s:%d", llama2.getHost(), llama2.getFirstMappedPort());

        ChatLanguageModel model = OllamaChatModel.builder()
                .baseUrl(baseUrl)
                .modelName("llama2")
                .timeout(Duration.ofMinutes(2))
                .maxRetries(3)
                .build();
        return model;
    }
}

