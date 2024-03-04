package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.MedicalFiles.FileOptions;

import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LoadFile {
    public static MultipartFile loadFile(String file){
        Path path = Paths.get("./src/main/java/com/dev/langbotchain/langchain4j/spring/MessageAnalyzer/MedicalFiles/1177Docs/" + file);
        String contentType = "text/plain";
        byte[] content = null;
        try {
            content = Files.readAllBytes(path);
        } catch (final IOException e) {
        }

        MultipartFile document = new MockMultipartFile(file,
                file, contentType, content);
        return document;
    }
}
