package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.DocsAnalyzer;

import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import dev.langchain4j.model.chat.ChatLanguageModel;

import static com.dev.langbotchain.langchain4j.spring.Config.ModelConfig.OllamaConfig.Ollama_model_names.OLLAMA_MODEL_NAMES;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.DocsAnalyzer.OllamaDocumentInitAnalyzer.initializeOllamaModel;

public class InitializeDocumentByModelAnalyzer {

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
