package com.dev.langbotchain.langchain4j.spring.API.Service;

import com.dev.langbotchain.langchain4j.spring.Generation.Stream.StreamGeneration;
import org.springframework.stereotype.Service;

import java.io.IOException;

import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.MessageAnalyzer.findSuitableModel;

@Service
public class StreamGenerationService {
    private final StreamGeneration streamGeneration;

    public StreamGenerationService(StreamGeneration streamGeneration) {
        this.streamGeneration = streamGeneration;
    }

    public void generateStream(String question, String uuid) throws IOException {
        String model = findSuitableModel(question, uuid);
        streamGeneration.GenerateStream(question, model, uuid);
    }
}
