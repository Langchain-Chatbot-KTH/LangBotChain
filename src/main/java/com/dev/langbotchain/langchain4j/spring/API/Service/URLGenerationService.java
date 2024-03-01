package com.dev.langbotchain.langchain4j.spring.API.Service;

import com.dev.langbotchain.langchain4j.spring.Generation.URL.URLtoTextGeneration;
import org.springframework.stereotype.Service;

import java.io.IOException;

import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.MessageAnalyzer.findSuitableModel;

@Service
public class URLGenerationService {

    private final URLtoTextGeneration urLtoTextGeneration;

    public URLGenerationService(URLtoTextGeneration urLtoTextGeneration) {
        this.urLtoTextGeneration = urLtoTextGeneration;
    }

    public String generateTextWithUrl(String question, String UrlPath, String uuid, int id) throws IOException {
        String modelName = findSuitableModel(question, uuid, id);
        return urLtoTextGeneration.generateTextWithUrl(question,UrlPath, modelName);
    }
}
