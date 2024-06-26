package com.dev.langbotchain.langchain4j.spring.API.Controller;

import com.dev.langbotchain.langchain4j.spring.API.Service.TextGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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

    @GetMapping("/text")
    public void generateText(@RequestParam String message,
                             @RequestParam String uuid,
                             @RequestParam int id) throws IOException {
        String jsonMessageQuestion = objectMapper.writeValueAsString(Map.of(
                "message", message,
                "uuid", uuid
        ));
        kafkaTemplate.send("questions", jsonMessageQuestion); // Not done in correct way. generateTextLlama2 should be listening on the topic.
        String answer = textGenerationService.generateText(message, uuid, id);
        String jsonMessageResponse = objectMapper.writeValueAsString(Map.of(
                "message", answer,
                "uuid", uuid
        ));
        kafkaTemplate.send("answers", jsonMessageResponse);
    }

    @GetMapping("/WholeText")
    public String generateWholeText(@RequestParam String message,
                                    @RequestParam String uuid,
                                    @RequestParam int id) throws IOException {
        return textGenerationService.generateText(message, uuid, id);
    }

    @GetMapping("/health")
    public String heartBeat() {
        return "Running";
    }
}

