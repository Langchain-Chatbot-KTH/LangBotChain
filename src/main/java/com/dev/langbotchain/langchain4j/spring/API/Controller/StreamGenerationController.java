package com.dev.langbotchain.langchain4j.spring.API.Controller;

import com.dev.langbotchain.langchain4j.spring.API.Service.StreamGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/generateStream")
public class StreamGenerationController {

    private final StreamGenerationService streamGenerationService;

    @Autowired
    public StreamGenerationController(StreamGenerationService streamGenerationService) {
        this.streamGenerationService = streamGenerationService;
    }

    @GetMapping("/model")
    public String generateText(@RequestParam String message,
                                               @RequestParam String uuid) throws IOException {
        streamGenerationService.generateStream(message, uuid);
        return "Streaming";
    }

    @GetMapping("/health")
    public String heartBeat() {
        return "Running";
    }
}

