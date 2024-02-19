package com.dev.langbotchain.langchain4j.ollama.spring.LlamaAPI;

import com.dev.langbotchain.langchain4j.ollama.spring.Service.StreamGenerationService;
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

    @GetMapping("/llama2")
    public ResponseEntity<StreamingResponseBody> generateTextLlama2(
            @RequestParam String message,
            @RequestParam String uuid) {
        return ResponseEntity.status(HttpStatus.OK)
                .body((OutputStream outputStream) -> {
                    streamGenerationService.generateStreamLlama2(message, outputStream, uuid);
                });
    }

    @GetMapping("/health")
    public String heartBeat() {
        return "Running";
    }
}