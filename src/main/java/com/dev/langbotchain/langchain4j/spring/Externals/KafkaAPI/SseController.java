package com.dev.langbotchain.langchain4j.spring.Externals.KafkaAPI;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@CrossOrigin(origins = {"http://localhost:3000", "http://127.0.0.1:3000"})
@RestController
public class SseController {
    private final ConcurrentHashMap<String, SseEmitter> emitters = new ConcurrentHashMap<>();
    private final ObjectMapper objectMapper;

    public SseController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping("/subscribe/{uuid}")
    public SseEmitter subscribe(@PathVariable UUID uuid) {
        SseEmitter emitter = new SseEmitter(Long.MAX_VALUE);
        String uuidString = uuid.toString();
        this.emitters.put(uuidString, emitter);

        emitter.onCompletion(() -> this.emitters.remove(uuidString));
        emitter.onTimeout(() -> this.emitters.remove(uuidString));
        emitter.onError((e) -> {
            System.out.println("Error in emitter for UUID: " + uuidString);
            this.emitters.remove(uuidString);
            emitter.completeWithError(e);
        });

        return emitter;
    }

    public void sendToClient(String uuid, Object dataObject) {
        SseEmitter emitter = emitters.get(uuid);
        if (emitter != null) {
            try {
                String jsonData = objectMapper.writeValueAsString(dataObject);
                emitter.send(SseEmitter.event().name("message").data(jsonData));
            } catch (Exception e) {
                System.out.println("Failed to send message to UUID: " + uuid);
                emitters.remove(uuid);
                emitter.complete();
            }
        }
    }
}