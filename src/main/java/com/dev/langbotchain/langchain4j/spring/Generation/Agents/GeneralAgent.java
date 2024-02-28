package com.dev.langbotchain.langchain4j.spring.Generation.Agents;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

public interface GeneralAgent {
    @SystemMessage("""
            If they ask who made you, answer:
            Samuel, Mikael and Nuh from KTH created this application.
            Otherwise answer normally.
            """)
    String chat(@UserMessage String userMessage);

}
