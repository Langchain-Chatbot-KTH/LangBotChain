package com.dev.langbotchain.langchain4j.spring.Config.KafkaConfig;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic receiveQuestionTopic() {
        return TopicBuilder.name("questions")
                .build();
    }

    @Bean
    public NewTopic sendBackAnswerTopic() {
        return TopicBuilder.name("answers")
                .build();
    }
}