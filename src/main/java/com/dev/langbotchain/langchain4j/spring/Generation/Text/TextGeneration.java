package com.dev.langbotchain.langchain4j.spring.Generation.Text;

import com.dev.langbotchain.langchain4j.spring.Generation.Agents.GeneralAgent;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;
import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.ModelList;

import org.springframework.stereotype.Component;
import org.testcontainers.containers.GenericContainer;

import static com.dev.langbotchain.langchain4j.spring.Config.ContainerConfig.ContainerConfig.createContainer;
import static com.dev.langbotchain.langchain4j.spring.Config.ContainerConfig.ContainerConfig.isContainerRunning;
import static com.dev.langbotchain.langchain4j.spring.Generation.Text.InitializeTextGeneration.initializeTextAssistant;

@Component
public class TextGeneration {

    private GeneralAgent assistant;

    public String GenerateText(String question, String modelName) {


        Model modelObject = ModelList.findModelByName(modelName);
        if(!isContainerRunning(modelObject.getLangchain4JDockerPath())){
            GenericContainer<?> model = createContainer(modelObject.getLangchain4JDockerPath());
            model.start();
            assistant = initializeTextAssistant(assistant, modelObject);
        }

        String answer = String.valueOf(chat(question));
        return answer;
    }
    private String chat(String message) {
        return assistant.chat(message);
    }
}

