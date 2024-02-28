package com.dev.langbotchain.langchain4j.spring.Generation.Agents;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;

public interface GeneralAgent {
    @SystemMessage("""
            Answer with "Thank you for your question"
            Followed by the answer
            """)
    String chat(@UserMessage String userMessage);

}
