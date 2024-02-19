package com.dev.langbotchain.langchain4j.spring.Generation.Stream;

import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import dev.langchain4j.model.chat.StreamingChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaStreamingChatModel;

import java.time.Duration;
import java.util.List;

import static com.dev.langbotchain.langchain4j.spring.Config.ContainerConfig.ContainerConfig.getContainerModel;

public class InitializeStreamByModel {
    private static final List<String> OLLAMA_MODEL_NAMES = List.of(
            "llama2", "mistral", "dolphin-phi", "phi", "neural-chat", "starling-lm",
            "codellama", "llama2-uncensored", "llama2:13b", "llama2:70b",
            "orca-mini", "vicuna", "llava"
    );

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
        String baseUrl = String.format("http://%s:%d", getContainerModel().getHost(), getContainerModel().getFirstMappedPort());

        StreamingChatLanguageModel languageModel = OllamaStreamingChatModel.builder()
                .baseUrl(baseUrl)
                .modelName(modelName)
                .timeout(Duration.ofMinutes(2))
                .build();
        return languageModel;
    }
}
