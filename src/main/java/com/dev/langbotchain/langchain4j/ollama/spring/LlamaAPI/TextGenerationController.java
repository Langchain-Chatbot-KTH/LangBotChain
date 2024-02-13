package com.dev.langbotchain.langchain4j.ollama.spring.LlamaAPI;

import com.dev.langbotchain.langchain4j.ollama.spring.Service.TextGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/llama2Doc")
    public String generateTextLlama2Doc(@RequestParam String message) {
        return textGenerationService.generateTextLlama2Doc(message);
    }

    @GetMapping("/health")
    public String heartBeat() {
        return "Running";
    }
}

