package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.MedicalFiles;

import java.io.IOException;
import java.util.List;

import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.MedicalFiles.FileOptions.SymptomsAndDisease.symptomsAndDisease;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.DocsAnalyzer.DocumentToTextGenerationAnalyzer.generateTextWithDocumentAnalyzer;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SymptomsAndDiseaseKeyWords.keywordsListSymptomsAndDisease;

public class MedicalSearch {
    public static String findSuitableMedicalFile(String question, String uuid, int id) throws IOException {
        List<String> symptomsAndDiseaseKeyWords = keywordsListSymptomsAndDisease();

        String lowercaseQuestion = question.toLowerCase();

        for (String keyword : symptomsAndDiseaseKeyWords) {
            if (lowercaseQuestion.contains(keyword.toLowerCase()) && question.contains("1177")) {
                generateTextWithDocumentAnalyzer(question, symptomsAndDisease(), "llama2", uuid, id);
                return "running";
            }
        }
        return "llama2";
    }
}
