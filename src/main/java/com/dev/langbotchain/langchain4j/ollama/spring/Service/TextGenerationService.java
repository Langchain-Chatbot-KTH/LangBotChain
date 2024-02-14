package com.dev.langbotchain.langchain4j.ollama.spring.Service;

import com.dev.langbotchain.langchain4j.ollama.spring.TextGeneration.LlamaTextGeneration;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class TextGenerationService {

    private final LlamaTextGeneration llamaTextGeneration;

    public TextGenerationService(LlamaTextGeneration llamaTextGeneration) {
        this.llamaTextGeneration = llamaTextGeneration;
    }

    public String generateTextLlama2(String question) {
        return llamaTextGeneration.GenerateTextLlama2(question);
    }

    public String generateTextWithDocumentLlama2(String question, MultipartFile document) throws IOException {
        return llamaTextGeneration.generateTextWithDocumentLlama2(question, document);
    }

    public String generateTextWithUrlLlama2(String question, String UrlPath) {
        return llamaTextGeneration.generateTextWithUrlLlama2(question,UrlPath);
    }
}


