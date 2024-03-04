package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords;

import java.util.ArrayList;
import java.util.List;

public class Covid19TelephoneServiceKeywords {
    public static List<String> getCovid19TelephoneServiceKeywords() {
        List<String> keywords = new ArrayList<>();

        keywords.add("covid-19");
        keywords.add("covid19");
        keywords.add("covid");
        keywords.add("coronavirus");
        keywords.add("corona");

        return keywords;
    }

    public static String getCovid19TelephoneServiceFileName(){
        return "1177Covid19Advice.txt";
    }
}
