package com.dev.langbotchain.langchain4j.spring.Externals.Controller;

import com.dev.langbotchain.langchain4j.spring.Externals.Service.DocumentGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/generateTextFromDocument")
public class DocumentGenerationController {

    private final DocumentGenerationService documentGenerationService;

    @Autowired
    public DocumentGenerationController(DocumentGenerationService documentGenerationService) {
        this.documentGenerationService = documentGenerationService;
    }

    @PostMapping("/document")
    public String generateTextWithDocument(
            @RequestParam String message,
            @RequestPart("document") MultipartFile document,
            @RequestParam String modelName) throws IOException {
        return documentGenerationService.generateTextWithDocument(message,document, modelName);
    }

}
