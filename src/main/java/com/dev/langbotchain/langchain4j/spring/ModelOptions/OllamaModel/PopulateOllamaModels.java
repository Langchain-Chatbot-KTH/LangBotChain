package com.dev.langbotchain.langchain4j.spring.ModelOptions.OllamaModel;

import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.SupportedModelProperties;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;

import java.util.ArrayList;

public class PopulateOllamaModels {
    public static void populateOllamaModels(ArrayList<Model> models){
        ArrayList<SupportedModelProperties> ollamaProperties = new ArrayList<>();
        ollamaProperties.add(SupportedModelProperties.embeddingModel);
        ollamaProperties.add(SupportedModelProperties.streamingLanguageModel);
        ollamaProperties.add(SupportedModelProperties.languageModel);
        ollamaProperties.add(SupportedModelProperties.streamingChatModel);
        ollamaProperties.add(SupportedModelProperties.chatModel);

        models.add(new Model("llama2", ollamaProperties, "langchain4j/ollama-llama2:latest", 3.8));
        models.add(new Model("mistral", ollamaProperties, "langchain4j/ollama-mistral:latest", 4.1));
        models.add(new Model("dolphin-phi", ollamaProperties, "langchain4j/ollama-dolphin-phi:latest", 1.6));
        models.add(new Model("phi", ollamaProperties, "langchain4j/ollama-phi:latest", 1.7));
        models.add(new Model("neural-chat", ollamaProperties, "langchain4j/ollama-neural-chat:latest", 4.1));
        models.add(new Model("starling-lm", ollamaProperties, "langchain4j/ollama-starling-lm:latest", 4.1));
        models.add(new Model("codellama", ollamaProperties, "langchain4j/ollama-codellama:latest", 3.8));
        models.add(new Model("llama2-uncensored", ollamaProperties, "langchain4j/ollama-llama2-uncensored:latest", 3.8));
        models.add(new Model("llama2:13b", ollamaProperties, "langchain4j/ollama-llama2:13b:latest", 7.3));
        models.add(new Model("llama2:70b", ollamaProperties, "langchain4j/ollama-llama2:70b:latest", 39));
        models.add(new Model("orca-mini", ollamaProperties, "langchain4j/ollama-orca-mini:latest", 1.9));
        models.add(new Model("vicuna", ollamaProperties, "langchain4j/ollama-ollama-:latest", 3.8));
        models.add(new Model("llava", ollamaProperties, "langchain4j/ollama-ollama-llava:latest", 7));
    }
}
