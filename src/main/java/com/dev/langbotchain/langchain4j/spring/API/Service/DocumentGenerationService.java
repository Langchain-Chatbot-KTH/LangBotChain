package com.dev.langbotchain.langchain4j.spring.API.Service;

import com.dev.langbotchain.langchain4j.spring.Generation.Document.DocumentToTextGeneration;
import dev.langchain4j.service.TokenStream;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.MessageAnalyzer.findSuitableModel;

@Service
public class DocumentGenerationService {
    private final DocumentToTextGeneration documentToTextGeneration;

    public DocumentGenerationService(DocumentToTextGeneration documentToTextGeneration) {
        this.documentToTextGeneration = documentToTextGeneration;
    }

    public String generateTextWithDocument(String question, MultipartFile document, String uuid) throws IOException {
        String modelName = findSuitableModel(question, uuid);
        return documentToTextGeneration.generateTextWithDocument(question, document, modelName);
    }
}
