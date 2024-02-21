package com.dev.langbotchain.langchain4j.spring.Externals.Controller;

import com.dev.langbotchain.langchain4j.spring.Externals.Service.StreamGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.io.OutputStream;

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
                                               @RequestParam String model,
                                               @RequestParam String uuid) {
        streamGenerationService.generateStream(message, model, uuid);
        return "Streaming";
    }

    @GetMapping("/health")
    public String heartBeat() {
        return "Running";
    }
}

