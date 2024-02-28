package com.dev.langbotchain.langchain4j.spring.Generation.Stream;

import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import dev.langchain4j.model.chat.StreamingChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaStreamingChatModel;

import java.time.Duration;
import java.util.List;

import static com.dev.langbotchain.langchain4j.spring.Config.ModelConfig.OllamaConfig.Ollama_model_names.OLLAMA_MODEL_NAMES;
import static com.dev.langbotchain.langchain4j.spring.Config.OllamaServerConfig.OllamaServerCheck.baseUrl;

public class InitializeStreamByModel {
    protected static StreamingChatLanguageModel initializeModel(Model model) {
        String modelName = model.getName().toLowerCase();
        if (containsOllamaModel(modelName)) {
            return ollamaStream(modelName);
        }
        return null;
    }

    private static boolean containsOllamaModel(String modelName) {
        for (String ollamaModelName : OLLAMA_MODEL_NAMES) {
            if (modelName.contains(ollamaModelName)) {
                return true;
            }
        }
        return false;
    }
    private static StreamingChatLanguageModel ollamaStream(String modelName) {
        return OllamaStreamingChatModel.builder()
                .baseUrl(baseUrl)
                .modelName(modelName)
                .timeout(Duration.ofMinutes(2))
                .build();
    }
}
