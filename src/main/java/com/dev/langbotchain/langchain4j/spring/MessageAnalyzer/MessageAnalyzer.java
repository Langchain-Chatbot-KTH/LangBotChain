package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer;

import java.io.IOException;

import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.MedicalFiles.MedicalSearch.findSuitableMedicalFile;

public class MessageAnalyzer {
    public static String findSuitableModel(String message, String uuid, int id) throws IOException {
        String result = findSuitableMedicalFile(message, uuid, id);
        if (!result.equals("llama2")) {
            return "running";
        }

        if (message.toLowerCase().contains("sql")) {
            return "sqlcoder";
        } else if (message.toLowerCase().contains("medical")) {
            return "medllama2:7b";
        } else if (message.toLowerCase().contains("math")) {
            return "wizard-math";
        } else if (message.toLowerCase().contains("code")) {
            return "codellama";
        } else {
            return "llama2";
        }
    }
}
