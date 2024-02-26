package com.dev.langbotchain.langchain4j.spring.ModelOptions.DockerImport;

import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;

import java.io.*;
import java.util.ArrayList;

import static com.dev.langbotchain.langchain4j.spring.ModelOptions.OllamaModel.PopulateOllamaModels.populateOllamaModels;

public class DockerImageBuilder {
    static ArrayList<Model> names = new ArrayList<>();

    public static void main(String[] args) {
        populateOllamaModels(names);

        for (Model name : names) {
            System.out.println("Starting Docker Script for: " + name.getName());

            try {
                if (doesRepositoryExist("samuelteg/" + name.getName())) {
                    System.out.println("Repository samuelteg/" + name.getName() + " already exists. Skipping...");
                    continue;
                }

                String dockerfileContent = generateDockerfile(name.getName());

                System.out.println("Repo Not Found... Starting to write dockerfile for: " + name.getName());

                File dockerfile = new File("Dockerfile");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(dockerfile))) {
                    System.out.println("Writer initialized");
                    writer.write(dockerfileContent);
                    System.out.println("Dockerfile written to writer");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("Building image for: " + name.getName());
                ProcessBuilder buildProcess = new ProcessBuilder("docker", "build", "-t", "samuelteg/" + name.getName(), ".");
                buildProcess.directory(new File("."));
                System.out.println("Build Process Started...");
                Process build = buildProcess.start();

                StreamGobbler outputGobbler = new StreamGobbler(build.getInputStream(), System.out);
                StreamGobbler errorGobbler = new StreamGobbler(build.getErrorStream(), System.err);
                outputGobbler.start();
                errorGobbler.start();

                int exitCode = build.waitFor();
                outputGobbler.join();
                errorGobbler.join();

                System.out.println("Build Process Complete with exit code: " + exitCode);

                System.out.println("Push Process Initialized...");
                ProcessBuilder pushProcess = new ProcessBuilder("docker", "push", "samuelteg/" + name.getName());
                pushProcess.directory(new File("."));
                System.out.println("Push Process Started...");
                Process push = pushProcess.start();

                StreamGobbler pushOutputGobbler = new StreamGobbler(push.getInputStream(), System.out);
                StreamGobbler pushErrorGobbler = new StreamGobbler(push.getErrorStream(), System.err);
                pushOutputGobbler.start();
                pushErrorGobbler.start();

                push.waitFor();
                pushOutputGobbler.join();
                pushErrorGobbler.join();

                System.out.println("Push Process Complete...");

                System.out.println("Delete Process Initialized...");
                ProcessBuilder deleteProcess = new ProcessBuilder("docker", "rmi", "samuelteg/" + name.getName());
                deleteProcess.directory(new File("."));
                System.out.println("Delete Process Started...");
                Process delete = deleteProcess.start();

                StreamGobbler deleteOutputGobbler = new StreamGobbler(delete.getInputStream(), System.out);
                StreamGobbler deleteErrorGobbler = new StreamGobbler(delete.getErrorStream(), System.err);
                deleteOutputGobbler.start();
                deleteErrorGobbler.start();

                delete.waitFor();
                deleteOutputGobbler.join();
                deleteErrorGobbler.join();

                System.out.println("Delete Process Complete...");
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static String generateDockerfile(String name) {
        return "# syntax=docker/dockerfile:1\n" +
                "FROM --platform=linux/amd64 ollama/ollama:latest\n" +
                "RUN /bin/sh -c \"/bin/ollama serve & sleep 1 && ollama pull " + name + "\"\n" +
                "ENTRYPOINT [\"/bin/ollama\"]\n" +
                "CMD [\"serve\"]";
    }

    private static boolean doesRepositoryExist(String repositoryName) {
        try {
            Process process = Runtime.getRuntime().exec("docker pull --quiet " + repositoryName);
            int exitCode = process.waitFor();
            return exitCode == 0;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static class StreamGobbler extends Thread {
        private final InputStream inputStream;
        private final PrintStream outputStream;

        StreamGobbler(InputStream inputStream, PrintStream outputStream) {
            this.inputStream = inputStream;
            this.outputStream = outputStream;
        }

        public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    outputStream.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

