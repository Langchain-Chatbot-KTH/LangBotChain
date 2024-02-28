package com.dev.langbotchain.langchain4j.spring.API.Service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class OllamaServerService {

    public List<OllamaModelInfo> listAllOllamaModels() throws IOException, InterruptedException {
        List<OllamaModelInfo> modelInfos = new ArrayList<>();

        Process process = Runtime.getRuntime().exec("docker exec ollama ollama list");
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        reader.readLine();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\s+");
            if (parts.length >= 5) {
                String name = parts[0];
                String id = parts[1];
                String size = parts[2];
                String byteSize = parts[3];
                StringBuilder modified = new StringBuilder(parts[4]);
                for (int i = 5; i < parts.length; i++) {
                    modified.append(" ").append(parts[i]);
                }

                OllamaModelInfo modelInfo = new OllamaModelInfo(name, id, size, byteSize, modified.toString());
                modelInfos.add(modelInfo);
            }
        }
        process.waitFor();

        return modelInfos;
    }
    public String removeModel(String modelName) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("docker", "exec", "ollama", "ollama", "rm", modelName);

        Process process = processBuilder.start();
        int exitCode = process.waitFor();

        if (exitCode == 0) {
            return "Model removed successfully.";
        } else {
            return "Failed to remove model.";
        }
    }

    public String pullModel(String modelName) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("docker", "exec", "ollama", "ollama", "pull", modelName);

        Process process = processBuilder.start();

        if (process.isAlive()) {
            return "Model pulled successfully.";
        } else {
            return "Failed to pull model.";
        }
    }

    public static class OllamaModelInfo {
        private String name;
        private String id;
        private String size;
        private String byteSize;
        private String modified;

        public OllamaModelInfo(String name, String id, String size, String byteSize, String modified) {
            this.name = name;
            this.id = id;
            this.size = size;
            this.byteSize = byteSize;
            this.modified = modified;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public String getSize() {
            return size;
        }

        public String getByteSize() {
            return byteSize;
        }

        public String getModified() {
            return modified;
        }
    }
}
