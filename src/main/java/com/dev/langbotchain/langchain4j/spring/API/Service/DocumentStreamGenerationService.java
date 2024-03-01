
package com.dev.langbotchain.langchain4j.spring.API.Service;

import com.dev.langbotchain.langchain4j.spring.Generation.Document.DocumentToStreamGeneration;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class DocumentStreamGenerationService {
    private final DocumentToStreamGeneration documentToStreamGeneration;

    public DocumentStreamGenerationService(DocumentToStreamGeneration documentToStreamGeneration) {
        this.documentToStreamGeneration = documentToStreamGeneration;
    }

    public void generateStreamWithDocument(String question, MultipartFile document, String uuid, int id) throws IOException {
        String model = "llama2";
        documentToStreamGeneration.generateStreamWithDocument(question, document, model, uuid, id);
    }
}