package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords;

import java.util.ArrayList;
import java.util.List;

public class ExaminationsKeywords {
    public static List<String> getExaminationsKeywords() {
        List<String> keywords = new ArrayList<>();

        keywords.add("mammogram – breast screening");
        keywords.add("psa test for the prostate");
        keywords.add("breast screening");
        keywords.add("mammogram");
        keywords.add("prostate test");
        keywords.add("test prostate");
        keywords.add("prostate");

        return keywords;
    }

    public static String getTestsFileName(){
        return "1177tests.txt";
    }
}
