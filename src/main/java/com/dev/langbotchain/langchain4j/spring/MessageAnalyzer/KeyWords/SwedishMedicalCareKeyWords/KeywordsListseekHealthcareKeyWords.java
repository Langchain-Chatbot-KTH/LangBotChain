package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords;

import java.util.ArrayList;
import java.util.List;

public class KeywordsListseekHealthcareKeyWords {
    public static List<String> keywordsListseekHealthcareKeyWords() {
        List<String> keywords = new ArrayList<>();

        keywords.add("what is 1177");
        keywords.add("what do 1177");

        keywords.add("how to buy medicines in sweden");
        keywords.add("buy medicines in");
        keywords.add("how to buy medicines");
        keywords.add("buy medicines");

        keywords.add("healthcare works in sweden");
        keywords.add("how healthcare works");
        keywords.add("healthcare work");
        keywords.add("how does healthcare work in sweden");

        keywords.add("healthcare in sweden if you come from another country");
        keywords.add("care in sweden if you come from another country");
        keywords.add("healthcare in sweden as a foreigner");
        keywords.add("care in sweden as a foreigner");
        keywords.add("from another country");

        keywords.add("care if you are an asylum seeker");
        keywords.add("healthcare if you are an asylum seeker");
        keywords.add("care do not have a permit to be in sweden");
        keywords.add("healthcare do not have a permit to be in sweden");
        keywords.add("do not have a permit");

        return keywords;
    }

    public static String getSeekHealthcareFileName(){
        return "1177SeekHealthcare.txt";
    }
}
