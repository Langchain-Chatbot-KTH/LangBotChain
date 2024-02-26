package com.dev.langbotchain.langchain4j.spring.Generation.Document;

import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import dev.langchain4j.model.chat.ChatLanguageModel;
import java.util.List;

import static com.dev.langbotchain.langchain4j.spring.Generation.Document.OllamaDocumentInit.initializeOllamaModel;

public class InitializeDocumentByModel {
    private static final List<String> OLLAMA_MODEL_NAMES = List.of(
            "llama2", "mistral", "dolphin-phi", "phi", "neural-chat", "starling-lm",
            "codellama", "llama2-uncensored", "llama2:13b", "llama2:70b",
            "orca-mini", "vicuna", "llava",

            "gemma", "llama2", "mistral", "mixtral", "llava", "neural-chat",
            "codellama", "dolphin-mixtral", "mistral-openorca", "llama2-uncensored",
            "orca-mini", "phi", "deepseek-coder", "dolphin-mistral", "vicuna",
            "wizard-vicuna-uncensored", "zephyr", "openhermes", "wizardcoder",
            "qwen", "llama2-chinese", "phind-codellama", "tinyllama", "openchat",
            "orca2", "falcon", "wizard-math", "nous-hermes", "dolphin-phi",
            "starling-lm", "codeup", "tinydolphin", "starcoder", "medllama2",
            "yi", "wizardlm-uncensored", "everythinglm", "bakllava", "stable-code",
            "solar", "stable-beluga", "sqlcoder", "yarn-mistral",
            "nous-hermes2-mixtral", "samantha-mistral", "stablelm-zephyr",
            "meditron", "wizard-vicuna", "magicoder", "yarn-llama2", "stablelm2",
            "nous-hermes2", "deepseek-llm", "open-orca-platypus2", "llama-pro",
            "codebooga", "nexusraven", "mistrallite", "goliath", "notux",
            "alfred", "megadolphin", "wizardlm", "xwinlm", "notus", "nomic-embed-text",
            "duckdb-nsql", "all-minilm"
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
