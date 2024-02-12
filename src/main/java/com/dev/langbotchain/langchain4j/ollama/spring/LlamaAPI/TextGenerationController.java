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
        kafkaTemplate.send("questions", jsonMessageQuestion);
        String answer = textGenerationService.generateTextLlama2(message);
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

