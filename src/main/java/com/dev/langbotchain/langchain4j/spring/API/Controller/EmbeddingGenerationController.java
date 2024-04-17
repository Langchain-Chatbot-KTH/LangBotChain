package com.dev.langbotchain.langchain4j.spring.API.Controller;

import com.dev.langbotchain.langchain4j.spring.API.Service.DocumentStreamGenerationService;
import com.dev.langbotchain.langchain4j.spring.API.Service.EmbeddingGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/generateStreamFromEmbedding")
public class EmbeddingGenerationController {

    private final EmbeddingGenerationService embeddingGenerationService;

    @Autowired
    public EmbeddingGenerationController(EmbeddingGenerationService embeddingGenerationService) {
        this.embeddingGenerationService = embeddingGenerationService;
    }

    @GetMapping("/embeddingStream")
    public String generateStreamWithDocument(
            @RequestParam String message,
            @RequestParam String uuid,
            @RequestParam int id) throws IOException {
        embeddingGenerationService.generateStreamWithEmbedding(message, uuid, id);
        return "Streaming";
    }

}
