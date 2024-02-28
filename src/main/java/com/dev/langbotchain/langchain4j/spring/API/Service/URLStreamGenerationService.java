package com.dev.langbotchain.langchain4j.spring.Externals.Service;

import com.dev.langbotchain.langchain4j.spring.Generation.Stream.URLToStreamGeneration;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.core.KafkaTemplate;
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
