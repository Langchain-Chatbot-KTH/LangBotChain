package com.dev.langbotchain.langchain4j.ollama.spring.LlamaConfig;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;

@Getter
@Setter
class EmbeddingModelProperties {

    String baseUrl;
    String modelName;
    Duration timeout;
    Integer maxRetries;
}