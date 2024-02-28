package com.dev.langbotchain.langchain4j.spring.Generation.URL;

import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.ModelList;
import org.springframework.stereotype.Component;

import static com.dev.langbotchain.langchain4j.spring.Config.OllamaServerConfig.OllamaServerCheck.checkOllamaServerAndInitializeModel;
import static com.dev.langbotchain.langchain4j.spring.Config.OllamaServerConfig.OllamaServerCheck.ollamaServerModelInitialization;
import static com.dev.langbotchain.langchain4j.spring.Generation.URL.initializeURLByModel.getAnswer;
import static com.dev.langbotchain.langchain4j.spring.Generation.URL.initializeURLByModel.initializeTextWithUrl;

@Component
public class URLtoTextGeneration {

    public String generateTextWithUrl(String question, String UrlPath, String modelName) {
        Model modelObject = ModelList.findModelByName(modelName);
        checkOllamaServerAndInitializeModel(modelObject);
        initializeTextWithUrl(UrlPath, modelObject);

        String answer = getAnswer(question);
        return answer;
    }
}
