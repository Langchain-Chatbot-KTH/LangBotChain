package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords;

import java.util.ArrayList;
import java.util.List;

public class ChildCareKeywords {
    public static List<String> getChildCareKeywords() {
        List<String> keywords = new ArrayList<>();

        keywords.add("taking care of a child");
        keywords.add("childcare");
        keywords.add("newborn");
        keywords.add("infant");
        keywords.add("baby");
        keywords.add("examinations of your newborn baby");
        keywords.add("breastfeeding");
        keywords.add("common breastfeeding problems");
        keywords.add("infant formula and follow-on formula");
        keywords.add("how to reduce the risk of sudden infant death syndrome");
        keywords.add("sids");
        keywords.add("vaccination programme for children");
        keywords.add("children's health centre");

        return keywords;
    }

    public static String getChildCareFileName(){
        return "1177ChildCare.txt";
    }
}
