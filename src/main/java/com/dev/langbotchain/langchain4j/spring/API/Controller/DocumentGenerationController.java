package com.dev.langbotchain.langchain4j.spring.API.Controller;

import com.dev.langbotchain.langchain4j.spring.API.Service.DocumentGenerationService;
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
            @RequestParam String uuid,
            @RequestPart("document") MultipartFile document,
            @RequestParam int id) throws IOException {
        return documentGenerationService.generateTextWithDocument(message,document,uuid, id);
    }
}
