package com.dev.langbotchain.langchain4j.spring.Externals.KafkaAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class SseController {
    private final ConcurrentHashMap<String, SseEmitter> emitters = new ConcurrentHashMap<>();

    @GetMapping("/subscribe/{uuid}")
    public SseEmitter subscribe(@PathVariable UUID uuid) {
        System.out.println("UUID HERE: " + uuid);
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

    public void sendToClient(String uuid, String data) {
        System.out.println("Token sent to client: " + data);
        SseEmitter emitter = emitters.get(uuid);
        if (emitter != null) {
            try {
                emitter.send(SseEmitter.event().name("message").data(data));
            } catch (Exception e) {
                System.out.println("Failed to send message to UUID: " + uuid);
                emitters.remove(uuid);
                emitter.complete();
            }
        }
    }
}