package com.dev.langbotchain.langchain4j.spring.Externals.Service;

import com.dev.langbotchain.langchain4j.spring.Generation.Stream.DocumentToStreamGeneration;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class DocumentStreamGenerationService {
    private final DocumentToStreamGeneration documentToStreamGeneration;

    public DocumentStreamGenerationService(DocumentToStreamGeneration documentToStreamGeneration) {
        this.documentToStreamGeneration = documentToStreamGeneration;
    }

    public void generateStreamWithDocument(String question, MultipartFile document, String model, String uuid) throws IOException {
        documentToStreamGeneration.generateStreamWithDocument(question, document, model, uuid);
    }
}
