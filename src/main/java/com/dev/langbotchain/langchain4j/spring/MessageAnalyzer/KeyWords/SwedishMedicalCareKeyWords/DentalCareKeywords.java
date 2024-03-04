package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords;

import java.util.ArrayList;
import java.util.List;

public class DentalCareKeywords {
    public static List<String> getDentalCareKeywords() {
        List<String> keywords = new ArrayList<>();

        keywords.add("dental care");
        keywords.add("how dental care works in sweden");
        keywords.add("dental care in sweden");
        keywords.add("dental care in sweden if you come from another country");
        keywords.add("dental care if you are an asylum seeker");
        keywords.add("dental care as a asylum seeker");
        keywords.add("dental care as an asylum seeker");

        keywords.add("oral health");
        keywords.add("dental hygiene");
        keywords.add("teeth care");
        keywords.add("dentistry");
        keywords.add("oral hygiene");
        keywords.add("dental treatments");
        keywords.add("oral care");
        keywords.add("dental check-ups");
        keywords.add("tooth health");
        keywords.add("dental examinations");
        keywords.add("tooth care");
        keywords.add("dental services");
        keywords.add("dental treatment options");

        return keywords;
    }

    public static String getDentalCareFileName(){
        return "1177DentalCare.txt";
    }
}
