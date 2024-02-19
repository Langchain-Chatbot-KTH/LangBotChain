package com.dev.langbotchain.langchain4j.spring.Externals.Service;

import com.dev.langbotchain.langchain4j.spring.Generation.Stream.StreamGeneration;
import org.springframework.stereotype.Service;

import java.io.OutputStream;

@Service
public class StreamGenerationService {
    private final StreamGeneration streamGeneration;

    public StreamGenerationService(StreamGeneration streamGeneration) {
        this.streamGeneration = streamGeneration;
    }

    public void generateStream(String question, OutputStream outputStream , String model, String uuid) {
        streamGeneration.GenerateStream(question, outputStream, model, uuid);
    }
}
