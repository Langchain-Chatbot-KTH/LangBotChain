package com.dev.langbotchain.langchain4j.spring.API.Service;

import com.dev.langbotchain.langchain4j.spring.Generation.URL.URLToStreamGeneration;
import org.springframework.stereotype.Service;

@Service
public class URLStreamGenerationService {
    private final URLToStreamGeneration urlToStreamGeneration;

    public URLStreamGenerationService(URLToStreamGeneration urlToStreamGeneration) {
        this.urlToStreamGeneration = urlToStreamGeneration;
    }

    public String generateStreamWithURL(String question, String UrlPath, String uuid, int id) {
        String modelName = "llama2";
        return urlToStreamGeneration.generateStreamWithURL(question, UrlPath, modelName, uuid, id);
    }
}
