package com.dev.langbotchain.langchain4j.spring.Generation.Agents;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.TokenStream;

public interface GeneralStreamAssistant {
    @SystemMessage("""
            Start every message by saying: This is token stream generated
            Followed by the rest of the answer
            """)
    TokenStream chat(String userMessage);
}
