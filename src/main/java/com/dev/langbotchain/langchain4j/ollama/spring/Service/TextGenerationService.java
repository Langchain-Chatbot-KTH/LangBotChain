package com.dev.langbotchain.langchain4j.ollama.spring.Service;

import com.dev.langbotchain.langchain4j.ollama.spring.TextGeneration.LlamaTextGeneration;
import org.springframework.stereotype.Service;

@Service
public class TextGenerationService {

    private final LlamaTextGeneration llamaTextGeneration;

    public TextGenerationService(LlamaTextGeneration llamaTextGeneration) {
        this.llamaTextGeneration = llamaTextGeneration;
    }

    public String generateTextLlama2(String question) {
        return llamaTextGeneration.GenerateTextLlama2(question);
    }

    public String generateTextLlama2Doc(String question) {
        return llamaTextGeneration.GenerateTextLlama2Docs(question);
    }
}


