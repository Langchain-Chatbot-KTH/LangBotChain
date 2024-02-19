package com.dev.langbotchain.langchain4j.spring.Generation.URL;

import com.dev.langbotchain.langchain4j.spring.Generation.Agents.GeneralAgent;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.service.AiServices;

import java.time.Duration;

import static com.dev.langbotchain.langchain4j.spring.Config.ContainerConfig.ContainerConfig.getContainerModel;
import static com.dev.langbotchain.langchain4j.spring.Generation.URL.initializeURLByModel.initializeModel;

public class OllamaURLInit {
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
