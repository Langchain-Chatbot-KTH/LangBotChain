package com.dev.langbotchain.langchain4j.ollama.spring.Agents;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.TokenStream;
import dev.langchain4j.service.UserMessage;
import org.springframework.context.annotation.Bean;

public interface GeneralAgent {
    @Bean
    @SystemMessage("""
                You shall always answer with: Thank you for your question!
                Followed by your answer
                """)
    String chat(@UserMessage String userMessage);

}
