package com.dev.langbotchain.langchain4j.spring.Config.ModelConfig.OllamaConfig;

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