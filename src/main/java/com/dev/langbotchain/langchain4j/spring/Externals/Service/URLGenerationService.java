package com.dev.langbotchain.langchain4j.spring.Externals.Service;

import com.dev.langbotchain.langchain4j.spring.Generation.URL.URLtoTextGeneration;
import org.springframework.stereotype.Service;

@Service
public class URLGenerationService {

    private final URLtoTextGeneration urLtoTextGeneration;

    public URLGenerationService(URLtoTextGeneration urLtoTextGeneration) {
        this.urLtoTextGeneration = urLtoTextGeneration;
    }

    public String generateTextWithUrl(String question, String UrlPath, String modelName) {
        return urLtoTextGeneration.generateTextWithUrl(question,UrlPath, modelName);
    }
}
