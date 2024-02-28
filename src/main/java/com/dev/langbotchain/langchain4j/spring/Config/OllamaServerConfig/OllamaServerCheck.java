package com.dev.langbotchain.langchain4j.spring.Config.OllamaServerConfig;

import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OllamaServerCheck {

    public static String baseUrl = "http://localhost:11434";

    public static void checkOllamaServerAndInitializeModel(Model model) {
        if (!isContainerRunning("'ollama'")) {
            startOllamaContainer();
        }
        ollamaServerModelInitialization(model);
    }

    public static boolean isContainerRunning(String containerName) {
        try {
            ProcessBuilder pb = new ProcessBuilder("docker", "ps", "--format", "'{{.Names}}'");
            Process process = pb.start();
            process.waitFor();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(containerName)) {
                    return true;
                }
            }
            return false;

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }
    static void startOllamaContainer() {
        try {
            ProcessBuilder pb = new ProcessBuilder("docker", "run", "-d", "--gpus=all", "-v", "ollama:/root/.ollama", "-p", "11434:11434", "--name", "ollama", "ollama/ollama");
            Process process = pb.start();
            process.waitFor();

            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            String errorLine;
            while ((errorLine = errorReader.readLine()) != null) {
                System.err.println(errorLine);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    static public void ollamaServerModelInitialization(Model model) {
        ArrayList<String> modeList = new ArrayList<>();

        try {
            Process process = Runtime.getRuntime().exec("docker exec ollama ollama list");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length >= 5) {
                    modeList.add(parts[0]);
                }
            }

            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            String errorLine;
            while ((errorLine = errorReader.readLine()) != null) {
                System.err.println(errorLine);
            }

            reader.close();
            errorReader.close();

            if (!modeList.contains(model.getLangchain4JDockerPath())) {
                ProcessBuilder newPb = new ProcessBuilder("docker", "exec", "ollama", "ollama", "pull", model.getLangchain4JDockerPath());
                Process newProcess = newPb.start();
                newProcess.waitFor();
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
