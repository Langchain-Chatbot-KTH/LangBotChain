package com.dev.langbotchain;

import com.dev.langbotchain.langchain4j.ollama.spring.TextGeneration.LlamaStreamGeneration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.ByteArrayOutputStream;

@SpringBootApplication
public class LangBotChainApplication {

    public static void main(String[] args) {
        SpringApplication.run(LangBotChainApplication.class, args);

//        LlamaStreamGeneration generator = new LlamaStreamGeneration();
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//
//        // Assuming "hello" is a valid question to ask the model
//        String question = "What is the capital city of England?";
//
//        generator.GenerateStreamLlama2(question, outputStream, "12");
//
//        // Convert the outputStream to String and print it
//        String response = outputStream.toString();
//        System.out.println(" ");
//        System.out.println("Response from model: " + response);
    }

}
