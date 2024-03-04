package com.dev.langbotchain.langchain4j.spring.API.Service;

import com.dev.langbotchain.langchain4j.spring.Generation.Stream.StreamGeneration;
import org.springframework.stereotype.Service;

import java.io.IOException;

import static com.dev.langbotchain.langchain4j.spring.Config.ModelConfig.OllamaConfig.Ollama_model_names.OLLAMA_MODEL_NAMES;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.MessageAnalyzer.findSuitableModel;

@Service
public class StreamGenerationService {
    private final StreamGeneration streamGeneration;

    public StreamGenerationService(StreamGeneration streamGeneration) {
        this.streamGeneration = streamGeneration;
    }

    public String generateStream(String question, String uuid, int id) throws IOException {
        String response = findSuitableModel(question, uuid, id);

        if (!response.equals("running")){
            return streamGeneration.GenerateStream(question, response, uuid, id);
        }
        return "Running";
    }
}
