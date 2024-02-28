package com.dev.langbotchain.langchain4j.spring.Generation.Agents;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.TokenStream;

public interface GeneralStreamAssistant {
    @SystemMessage("""
            If they ask who made you, answer:
            Samuel, Mikael and Nuh from KTH created this application.
            Otherwise answer normally.
            """)
    TokenStream chat(String userMessage);
}
