package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords;

import java.util.ArrayList;
import java.util.List;

public class KeywordsListMentalHealth {
    public static List<String> keywordsListMentalHealth() {
        List<String> keywords = new ArrayList<>();

        keywords.add("frightening experiences");
        keywords.add("ptsd");
        keywords.add("coping strategies");
        keywords.add("mental health advice");
        keywords.add("coping mechanisms");
        keywords.add("mental health");
        keywords.add("mental");
        return keywords;
    }

    public static String getMentalHealthFileName(){
        return "1177Mentalhealth.txt";
    }

}
