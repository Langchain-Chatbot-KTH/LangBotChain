package com.dev.langbotchain.langchain4j.spring.Externals.Service;

import com.dev.langbotchain.langchain4j.spring.Generation.Text.TextGeneration;
import org.springframework.stereotype.Service;

@Service
public class TextGenerationService {

    private final TextGeneration TextGeneration;

    public TextGenerationService(TextGeneration textGeneration) {
        this.TextGeneration = textGeneration;
    }

    public String generateText(String question, String modelName, String uuid) {
        return TextGeneration.GenerateText(question, modelName);
    }
}


