package com.dev.langbotchain.langchain4j.spring.Externals.Controller;

import com.dev.langbotchain.langchain4j.spring.Externals.Service.URLGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generateTextFromURL")
public class URLGenerationController {

    private final URLGenerationService urlGenerationService;

    @Autowired
    public URLGenerationController(URLGenerationService urlGenerationService) {
        this.urlGenerationService = urlGenerationService;
    }

    @GetMapping("/url")
    public String generateTextWithUrl(
            @RequestParam String message,
            @RequestParam String urlPath,
            @RequestParam String modelName) {
        return urlGenerationService.generateTextWithUrl(message, urlPath, modelName);
    }
}
