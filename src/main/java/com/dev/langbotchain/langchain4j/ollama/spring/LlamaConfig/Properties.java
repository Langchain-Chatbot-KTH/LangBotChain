package com.dev.langbotchain.langchain4j.ollama.spring.LlamaConfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = Properties.PREFIX)
public class Properties {

    static final String PREFIX = "langchain4j.ollama";

    @NestedConfigurationProperty
    ChatModelProperties chatModel;

    @NestedConfigurationProperty
    ChatModelProperties streamingChatModel;

    @NestedConfigurationProperty
    LanguageModelProperties languageModel;

    @NestedConfigurationProperty
    LanguageModelProperties streamingLanguageModel;

    @NestedConfigurationProperty
    EmbeddingModelProperties embeddingModel;
}
