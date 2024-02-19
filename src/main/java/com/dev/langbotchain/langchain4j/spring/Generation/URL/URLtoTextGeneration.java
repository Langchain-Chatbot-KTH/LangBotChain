package com.dev.langbotchain.langchain4j.spring.Generation.URL;

import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.ModelList;
import org.springframework.stereotype.Component;
import org.testcontainers.containers.GenericContainer;

import static com.dev.langbotchain.langchain4j.spring.Config.ContainerConfig.ContainerConfig.createContainer;
import static com.dev.langbotchain.langchain4j.spring.Config.ContainerConfig.ContainerConfig.isContainerRunning;
import static com.dev.langbotchain.langchain4j.spring.Generation.URL.initializeURLByModel.getAnswer;
import static com.dev.langbotchain.langchain4j.spring.Generation.URL.initializeURLByModel.initializeTextWithUrl;

@Component
public class URLtoTextGeneration {

    public String generateTextWithUrl(String question, String UrlPath, String modelName) {
        Model modelObject = ModelList.findModelByName(modelName);
        if(!isContainerRunning(modelObject.getLangchain4JDockerPath())){
            GenericContainer<?> model = createContainer(modelObject.getLangchain4JDockerPath());
            model.start();
            initializeTextWithUrl(UrlPath, modelObject);
        }

        String answer = getAnswer(question);
        return answer;
    }
}
