package com.dev.langbotchain.langchain4j.spring.Externals.Controller;



import com.dev.langbotchain.langchain4j.spring.Externals.Service.URLStreamGenerationService;
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
    public String generateTextWithUrl(
            @RequestParam String message,
            @RequestParam String urlPath,
            @RequestParam String modelName,
            @RequestParam String uuid){
        urlStreamGenerationService.generateStreamWithURL(message, urlPath, modelName, uuid);
        return "Streaming";
    }
}

