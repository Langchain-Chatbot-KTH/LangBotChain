package com.dev.langbotchain.langchain4j.ollama.spring.Service;

import com.dev.langbotchain.langchain4j.ollama.spring.TextGeneration.LlamaStreamGeneration;
import org.springframework.stereotype.Service;
import java.io.OutputStream;

@Service
public class StreamGenerationService {
    private final LlamaStreamGeneration llamaStreamGeneration;

    public StreamGenerationService(LlamaStreamGeneration llamaStreamGeneration) {
        this.llamaStreamGeneration = llamaStreamGeneration;
    }

    public void generateStreamLlama2(String question, OutputStream outputStream, String uuid) {
        llamaStreamGeneration.GenerateStreamLlama2(question, outputStream, uuid);
    }
}
