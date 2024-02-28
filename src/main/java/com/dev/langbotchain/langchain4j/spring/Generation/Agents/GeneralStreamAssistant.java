package com.dev.langbotchain.langchain4j.spring.Generation.Agents;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.TokenStream;

public interface GeneralStreamAssistant {
    @SystemMessage("""
            Answer with "Thank you for your question"
            Followed by the answer
            """)
    TokenStream chat(String userMessage);
}
