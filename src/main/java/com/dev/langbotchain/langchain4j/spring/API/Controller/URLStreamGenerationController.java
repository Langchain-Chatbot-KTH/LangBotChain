package com.dev.langbotchain.langchain4j.spring.API.Controller;

import com.dev.langbotchain.langchain4j.spring.API.Service.URLStreamGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generateStreamFromURL")
public class URLStreamGenerationController {

    private final URLStreamGenerationService urlStreamGenerationService;

    @Autowired
    public URLStreamGenerationController(URLStreamGenerationService urlStreamGenerationService) {
        this.urlStreamGenerationService = urlStreamGenerationService;
    }

    @GetMapping("/url")
    public String generateStreamWithUrl(
            @RequestParam String message,
            @RequestParam String urlPath,
            @RequestParam String uuid,
            @RequestParam int id){
        return urlStreamGenerationService.generateStreamWithURL(message, urlPath, uuid, id);
    }
}

