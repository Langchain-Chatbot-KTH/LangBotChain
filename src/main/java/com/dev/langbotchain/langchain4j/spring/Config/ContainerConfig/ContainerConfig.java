package com.dev.langbotchain.langchain4j.spring.Config.ContainerConfig;

import com.github.dockerjava.api.DockerClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testcontainers.DockerClientFactory;
import org.testcontainers.containers.GenericContainer;

public class ContainerConfig {
    private static final Logger logger = LoggerFactory.getLogger(ContainerConfig.class);
    private static GenericContainer<?> model;

    public static GenericContainer<?> createContainer(String dockerImageLocation) {
        try {
            model = new GenericContainer<>(dockerImageLocation)
                    .withExposedPorts(11434);
            return model;
        } catch (Exception e) {
            logger.error("Error occurred while creating container", e);
            return null;
        }
    }

    public static GenericContainer<?> getContainerModel() {
        return model;
    }

    public static boolean isContainerRunning(String dockerImageLocation) {
        DockerClient dockerClient = DockerClientFactory.instance().client();
        return dockerClient.listContainersCmd().exec().stream()
                .anyMatch(container -> container.getImage().equals(dockerImageLocation));
    }
}
