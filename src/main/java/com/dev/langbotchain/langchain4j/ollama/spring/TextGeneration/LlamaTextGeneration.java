package com.dev.langbotchain.langchain4j.ollama.spring.TextGeneration;

import dev.langchain4j.model.language.LanguageModel;
import dev.langchain4j.model.ollama.OllamaLanguageModel;
import org.springframework.stereotype.Component;
import org.testcontainers.containers.GenericContainer;

@Component
public class LlamaTextGeneration {
    static String MODEL_NAME = "llama2";
    GenericContainer<?> ollama = new GenericContainer<>("langchain4j/ollama-" + MODEL_NAME + ":latest")
            .withExposedPorts(11434);
    public String GenerateText(String question) {

        if(!ollama.isRunning()){
            ollama.start();
        }

        String baseUrl = String.format("http://%s:%d", ollama.getHost(), ollama.getFirstMappedPort());

        LanguageModel model = OllamaLanguageModel.builder()
                .baseUrl(baseUrl)
                .modelName(MODEL_NAME)
                .build();

        String answer = String.valueOf(model.generate(question));
        return answer;
    }
}
