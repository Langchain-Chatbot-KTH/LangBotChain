package com.dev.langbotchain.langchain4j.spring.DockerImport;

import com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.Model;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
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

                // Now, add Docker system prune command after deleting the image
                System.out.println("Pruning Docker system...");
                ProcessBuilder pruneProcess = new ProcessBuilder("docker", "system", "prune", "-f");
                pruneProcess.directory(new File("."));
                System.out.println("Prune Process Started...");
                Process prune = pruneProcess.start();

                StreamGobbler pruneOutputGobbler = new StreamGobbler(prune.getInputStream(), System.out);
                StreamGobbler pruneErrorGobbler = new StreamGobbler(prune.getErrorStream(), System.err);
                pruneOutputGobbler.start();
                pruneErrorGobbler.start();

                prune.waitFor();
                pruneOutputGobbler.join();
                pruneErrorGobbler.join();

                System.out.println("Prune Process Complete...");
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

    private static boolean doesRepositoryExist(String repositoryWithTag) throws IOException {
        String[] parts = repositoryWithTag.split(":");
        String repositoryName = parts[0];
        String tagName = parts.length > 1 ? parts[1] : null;
        if (tagName == null) {
            URL url = new URL("https://hub.docker.com/v2/repositories/" + repositoryName);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            return responseCode == HttpURLConnection.HTTP_OK;
        } else {
            // Check if the repository exists with a specific tag
            URL url = new URL("https://hub.docker.com/v2/repositories/" + repositoryName + "/tags/" + tagName);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            return responseCode == HttpURLConnection.HTTP_OK;
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

