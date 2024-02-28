package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.DocsAnalyzer;

import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;

import java.time.Duration;

import static com.dev.langbotchain.langchain4j.spring.Config.OllamaServerConfig.OllamaServerCheck.baseUrl;

public class OllamaDocumentInitAnalyzer {
    protected static ChatLanguageModel initializeOllamaModel(Model modelObject){
        ChatLanguageModel model = OllamaChatModel.builder()
                .baseUrl(baseUrl)
                .modelName(modelObject.getName())
                .timeout(Duration.ofMinutes(2))
                .maxRetries(3)
                .build();
        return model;
    }
}
