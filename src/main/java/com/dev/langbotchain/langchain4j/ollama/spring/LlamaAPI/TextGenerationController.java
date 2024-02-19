package com.dev.langbotchain.langchain4j.ollama.spring.LlamaAPI;

import com.dev.langbotchain.langchain4j.ollama.spring.Service.TextGenerationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/generateText")
public class TextGenerationController {
    private final TextGenerationService textGenerationService;
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;
    @Autowired
    public TextGenerationController(TextGenerationService textGenerationService,
                                    KafkaTemplate<String, String> kafkaTemplate,
                                    ObjectMapper objectMapper) {
        this.textGenerationService = textGenerationService;
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    @GetMapping("/llama2")
    public void generateTextLlama2 (
            @RequestParam String message,
            @RequestParam String uuid) throws JsonProcessingException {
        String jsonMessageQuestion = objectMapper.writeValueAsString(Map.of(
                "message", message,
                "uuid", uuid
        ));
        kafkaTemplate.send("questions", jsonMessageQuestion); // Not done in correct way. generateTextLlama2 should be listening on the topic.
        String answer = textGenerationService.generateTextLlama2(message);
        String jsonMessageResponse = objectMapper.writeValueAsString(Map.of(
                "message", answer,
                "uuid", uuid
        ));
        kafkaTemplate.send("answers", jsonMessageResponse);
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