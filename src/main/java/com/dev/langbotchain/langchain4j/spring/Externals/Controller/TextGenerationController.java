package com.dev.langbotchain.langchain4j.spring.Externals.Controller;

import com.dev.langbotchain.langchain4j.spring.Externals.Service.TextGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public void generateTextLlama2(@RequestParam String message,
                                     @RequestParam String modelName,
                                     @RequestParam String uuid)  throws JsonProcessingException {
        String jsonMessageQuestion = objectMapper.writeValueAsString(Map.of(
                "message", message,
                "uuid", uuid
        ));
        kafkaTemplate.send("questions", jsonMessageQuestion); // Not done in correct way. generateTextLlama2 should be listening on the topic.
        String answer = textGenerationService.generateText(message, modelName, uuid);
        String jsonMessageResponse = objectMapper.writeValueAsString(Map.of(
                "message", answer,
                "uuid", uuid
        ));
        kafkaTemplate.send("answers", jsonMessageResponse);
    }

    @GetMapping("/health")
    public String heartBeat() {
        return "Running";
    }
}

