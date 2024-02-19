package com.dev.langbotchain.langchain4j.spring.Generation.Document;

import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;

import java.time.Duration;

import static com.dev.langbotchain.langchain4j.spring.Config.ContainerConfig.ContainerConfig.getContainerModel;

public class OllamaDocumentInit {
    protected static ChatLanguageModel initializeOllamaModel(Model modelObject){
        String baseUrl = String.format("http://%s:%d", getContainerModel().getHost(), getContainerModel().getFirstMappedPort());

        ChatLanguageModel model = OllamaChatModel.builder()
                .baseUrl(baseUrl)
                .modelName(modelObject.getName())
                .timeout(Duration.ofMinutes(2))
                .maxRetries(3)
                .build();
        return model;
    }
}
