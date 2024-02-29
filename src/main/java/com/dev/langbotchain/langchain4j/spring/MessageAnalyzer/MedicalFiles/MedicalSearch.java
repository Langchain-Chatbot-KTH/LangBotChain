package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.MedicalFiles;

import java.io.IOException;

import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.DocsAnalyzer.DocumentToTextGenerationAnalyzer.generateTextWithDocumentAnalyzer;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.MedicalFiles.FileOptions.HIV.hivFile;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.MedicalFiles.FileOptions.Measles.measlesFile;

public class MedicalSearch {
    public static String findSuitableMedicalFile(String question, String uuid) throws IOException {
        if (question.toLowerCase().contains("according to 1177")) {
            if (question.toLowerCase().contains("hiv")) {
                generateTextWithDocumentAnalyzer(question, hivFile(), "llama2", uuid);
            }
            if(question.toLowerCase().contains("measles")){
                generateTextWithDocumentAnalyzer(question, measlesFile(), "llama2", uuid);
            }
        }
        return "llama2";
    }
}
