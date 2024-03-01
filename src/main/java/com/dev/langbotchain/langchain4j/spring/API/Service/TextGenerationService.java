package com.dev.langbotchain.langchain4j.spring.API.Service;

import com.dev.langbotchain.langchain4j.spring.Generation.Text.TextGeneration;
import org.springframework.stereotype.Service;

import java.io.IOException;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.MessageAnalyzer.findSuitableModel;

@Service
public class TextGenerationService {

    private final TextGeneration textGeneration;

    public TextGenerationService(TextGeneration textGeneration) {
        this.textGeneration = textGeneration;
    }

    public String generateText(String question, String uuid, int id) throws IOException {
        String response = findSuitableModel(question, uuid, id);

        if (!response.equals("running")){
            return textGeneration.GenerateText(question, response);
        }
        return response;
    }
}
