package com.dev.langbotchain.langchain4j.ollama.spring.LlamaAPI;

import com.dev.langbotchain.langchain4j.ollama.spring.Service.TextGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/generateText")
public class TextGenerationController {

    private final TextGenerationService textGenerationService;

    @Autowired
    public TextGenerationController(TextGenerationService textGenerationService) {
        this.textGenerationService = textGenerationService;
    }


    @GetMapping("/llama2")
    public String generateTextLlama2(@RequestParam String message) {
        return textGenerationService.generateTextLlama2(message);
    }

    @GetMapping("/llama2/url")
    public String generateTextWithUrlLlama2(@RequestParam String message,
                                            @RequestParam String UrlPath) {
        return textGenerationService.generateTextWithUrlLlama2(message,UrlPath);
    }

    @PostMapping("/llama2/Document")
    public String generateTextWithDocumentLlama2(
            @RequestParam String message,
            @RequestPart("document") MultipartFile document) throws IOException {
        return textGenerationService.generateTextWithDocumentLlama2(message,document);
    }

    @GetMapping("/health")
    public String heartBeat() {
        return "Running";
    }
}

