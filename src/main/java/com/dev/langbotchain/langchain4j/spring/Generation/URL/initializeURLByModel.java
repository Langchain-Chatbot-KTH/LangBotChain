package com.dev.langbotchain.langchain4j.spring.Generation.URL;

import com.dev.langbotchain.langchain4j.spring.Generation.Agents.GeneralAgent;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.DocumentParser;
import dev.langchain4j.data.document.loader.UrlDocumentLoader;
import dev.langchain4j.data.document.parser.TextDocumentParser;
import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.rag.content.retriever.ContentRetriever;
import dev.langchain4j.service.AiServices;

import static com.dev.langbotchain.langchain4j.spring.Config.ModelConfig.OllamaConfig.Ollama_model_names.OLLAMA_MODEL_NAMES;
import static com.dev.langbotchain.langchain4j.spring.Generation.ContentRetriver.ContentRetriverObject.createContentRetriever;
import static com.dev.langbotchain.langchain4j.spring.Generation.URL.OllamaURLInit.initializeOllamaModel;

public class initializeURLByModel {
    private static GeneralAgent assistant;

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

    protected static void initializeTextWithUrl(String UrlPath, Model model) {
        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);
        DocumentParser documentParser = new TextDocumentParser();
        Document document = UrlDocumentLoader.load(UrlPath, documentParser);

        ContentRetriever contentRetriever = createContentRetriever(document);

        assistant = AiServices.builder(GeneralAgent.class)
                .chatLanguageModel(initializeModel(model))
                .contentRetriever(contentRetriever)
                .chatMemory(chatMemory)
                .build();

        System.out.println("Assistant with URL is loaded");
    }

    protected static String getAnswer(String question){
        return String.valueOf(chat(question));
    }

    private static String chat(String message) {
        return assistant.chat(message);
    }
}
