package com.dev.langbotchain.langchain4j.spring.Generation.Document;

import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import dev.langchain4j.model.chat.ChatLanguageModel;
import java.util.List;

import static com.dev.langbotchain.langchain4j.spring.Generation.Document.OllamaDocumentInit.initializeOllamaModel;

public class InitializeDocumentByModel {
    private static final List<String> OLLAMA_MODEL_NAMES = List.of(
            "llama2", "mistral", "dolphin-phi", "phi", "neural-chat", "starling-lm",
            "codellama", "llama2-uncensored", "llama2:13b", "llama2:70b",
            "orca-mini", "vicuna", "llava"
    );

    protected static ChatLanguageModel initializeModel(Model model) {
        String modelName = model.getName().toLowerCase();
        if (containsOllamaModel(modelName)) {
            return initializeOllamaModel(model);
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
}
