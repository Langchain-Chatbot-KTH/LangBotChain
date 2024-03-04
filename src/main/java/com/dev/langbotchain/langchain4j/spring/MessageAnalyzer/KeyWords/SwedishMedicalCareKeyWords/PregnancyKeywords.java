package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords;

import java.util.ArrayList;
import java.util.List;

public class PregnancyKeywords {
    public static List<String> getPregnancyKeywords() {
        List<String> keywords = new ArrayList<>();

        keywords.add("pregnancy");
        keywords.add("abortion");
        keywords.add("nausea during pregnancy");
        keywords.add("pelvic pain during pregnancy");
        keywords.add("pre-eclampsia");
        keywords.add("braxton Hicks contractions");
        keywords.add("labour contractions");
        keywords.add("alcohol and pregnancy");
        keywords.add("tobacco and pregnancy");
        keywords.add("midwifery clinic visits");
        keywords.add("graviditetsenkäten (Pregnancy Survey)");

        return keywords;
    }

    public static String getPregnancyFileName(){
        return "1177Pregnancy.txt";
    }
}
