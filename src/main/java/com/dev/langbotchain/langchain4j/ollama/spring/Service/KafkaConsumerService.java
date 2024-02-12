package com.dev.langbotchain.langchain4j.ollama.spring.Service;

import com.dev.langbotchain.langchain4j.ollama.spring.LlamaAPI.SseController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Map;

@Service
public class KafkaConsumerService {

    private final ObjectMapper objectMapper;
    private final SseController sseController;

    @Autowired
    public KafkaConsumerService(SseController sseController) {
        this.sseController = sseController;
        this.objectMapper = new ObjectMapper();
    }

    @Transactional
    @KafkaListener(topics = "answers", groupId = "group1")
    public void listen(String message) throws JsonProcessingException {
        Map<String, String> map = objectMapper.readValue(message, new TypeReference<>() {});
        String uuid = map.get("uuid");
        String botResponse = map.get("message");

        sseController.sendToClient(uuid, botResponse);
    }
}
