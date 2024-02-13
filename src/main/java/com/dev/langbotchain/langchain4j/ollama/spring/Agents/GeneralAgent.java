package com.dev.langbotchain.langchain4j.ollama.spring.Agents;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

public interface GeneralAgent {
    @SystemMessage("""
                You shall always answer with: Thank you for your question!
                Followed by your answer
                """)
    String chat(@UserMessage String userMessage);

}
