package com.dev.langbotchain.langchain4j.spring.Generation.Text;

import com.dev.langbotchain.langchain4j.spring.Generation.Agents.GeneralAgent;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.service.AiServices;

import java.time.Duration;
import java.util.List;

import static com.dev.langbotchain.langchain4j.spring.Config.ModelConfig.OllamaConfig.Ollama_model_names.OLLAMA_MODEL_NAMES;
import static com.dev.langbotchain.langchain4j.spring.Config.OllamaServerConfig.OllamaServerCheck.baseUrl;

public class InitializeTextGeneration {
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

    protected static ChatLanguageModel initializeOllamaModel(Model modelObject){
        ChatLanguageModel model = OllamaChatModel.builder()
                .baseUrl(baseUrl)
                .modelName(modelObject.getName())
                .timeout(Duration.ofMinutes(2))
                .maxRetries(3)
                .build();
        return model;
    }

    protected static GeneralAgent initializeTextAssistant(GeneralAgent assistant, Model model){
        String modelName = model.getName().toLowerCase();
        if (containsOllamaModel(modelName)) {
            return initializeOllamaTextAssistant(assistant, model);
        }
        return null;
    }

    private static GeneralAgent  initializeOllamaTextAssistant(GeneralAgent assistant, Model model) {
        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);

        ChatLanguageModel OllamaModel = initializeModel(model);
        assistant = AiServices.builder(GeneralAgent.class)
                .chatLanguageModel(OllamaModel)
                .chatMemory(chatMemory)
                .build();

        return assistant;
    }
}
