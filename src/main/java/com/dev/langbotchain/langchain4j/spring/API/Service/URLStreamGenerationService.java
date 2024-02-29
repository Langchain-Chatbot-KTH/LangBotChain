package com.dev.langbotchain.langchain4j.spring.Externals.Service;

import com.dev.langbotchain.langchain4j.spring.Generation.URL.URLToStreamGeneration;
import org.springframework.stereotype.Service;

@Service
public class URLStreamGenerationService {
    private final URLToStreamGeneration urlToStreamGeneration;

    public URLStreamGenerationService(URLToStreamGeneration urlToStreamGeneration) {
        this.urlToStreamGeneration = urlToStreamGeneration;
    }

    public void generateStreamWithURL(String question, String UrlPath, String modelName, String uuid) {
        urlToStreamGeneration.generateStreamWithURL(question, UrlPath, modelName, uuid);
    }
}
