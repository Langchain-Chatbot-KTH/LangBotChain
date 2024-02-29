package com.dev.langbotchain.langchain4j.spring.API.Service;

import com.dev.langbotchain.langchain4j.spring.Generation.Document.DocumentToTextGeneration;
import com.dev.langbotchain.langchain4j.spring.Generation.Text.TextGeneration;
import org.springframework.stereotype.Service;

import java.io.IOException;

import static com.dev.langbotchain.langchain4j.spring.Config.ModelConfig.OllamaConfig.Ollama_model_names.OLLAMA_MODEL_NAMES;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.MessageAnalyzer.findSuitableModel;

@Service
public class TextGenerationService {

    private final TextGeneration textGeneration;

    public TextGenerationService(TextGeneration textGeneration) {
        this.textGeneration = textGeneration;
    }

    public String generateText(String question, String uuid) throws IOException {
        String response = findSuitableModel(question, uuid);
        System.out.println(response);

        if (OLLAMA_MODEL_NAMES.contains(response.toLowerCase())) {
            return textGeneration.GenerateText(question, response);
        } else {
            return response;
        }
    }
}
