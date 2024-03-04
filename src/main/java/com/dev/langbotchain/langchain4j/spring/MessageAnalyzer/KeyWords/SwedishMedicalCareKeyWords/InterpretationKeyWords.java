package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords;

import java.util.ArrayList;
import java.util.List;

public class InterpretationKeyWords {
    public static List<String> interpretationKeyWords() {
        List<String> keywords = new ArrayList<>();

        keywords.add("interpretation into my language");
        keywords.add("interpreter");
        keywords.add("interpretation");

        return keywords;
    }

    public static String getInterpretationFileName(){
        return "1177Interpretation.txt";
    }
}
