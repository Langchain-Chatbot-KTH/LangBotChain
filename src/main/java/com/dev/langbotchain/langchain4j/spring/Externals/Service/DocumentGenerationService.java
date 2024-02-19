package com.dev.langbotchain.langchain4j.spring.Externals.Service;

import com.dev.langbotchain.langchain4j.spring.Generation.Document.DocumentToTextGeneration;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@Service
public class DocumentGenerationService {
    private final DocumentToTextGeneration documentToTextGeneration;

    public DocumentGenerationService(DocumentToTextGeneration documentToTextGeneration) {
        this.documentToTextGeneration = documentToTextGeneration;
    }


    public String generateTextWithDocument(String question, MultipartFile document, String modelName) throws IOException {
        return documentToTextGeneration.generateTextWithDocument(question, document, modelName);
    }
}
