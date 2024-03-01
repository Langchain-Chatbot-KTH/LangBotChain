package com.dev.langbotchain.langchain4j.spring.API.Controller;

import com.dev.langbotchain.langchain4j.spring.API.Service.DocumentStreamGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;

@RestController
@RequestMapping("/generateStreamFromDocument")
public class DocumentStreamGenerationController {

    private final DocumentStreamGenerationService documentStreamGenerationService;

    @Autowired
    public DocumentStreamGenerationController(DocumentStreamGenerationService documentStreamGenerationService) {
        this.documentStreamGenerationService = documentStreamGenerationService;
    }

    @PostMapping("/documentStream")
    public String generateStreamWithDocument(
            @RequestParam String message,
            @RequestPart("document") MultipartFile document,
            @RequestParam String uuid,
            @RequestParam int id) throws IOException {
        documentStreamGenerationService.generateStreamWithDocument(message,document, uuid, id);
        return "Streaming";
    }
}