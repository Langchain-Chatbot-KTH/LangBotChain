package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords;

import java.util.ArrayList;
import java.util.List;

public class SymptomsAndDiseaseKeyWords {
    public static List<String> keywordsListSymptomsAndDisease() {
        List<String> keywords = new ArrayList<>();

        keywords.add("hiv");
        keywords.add("aids");

        keywords.add("Measles");
        keywords.add("disease");
        keywords.add("rash");

        keywords.add("tuberculosis");

        keywords.add("gastroenteritis");
        keywords.add("nauseated");
        keywords.add("vomiting");
        keywords.add("diarrhoea");
        keywords.add("stomach pain");

        keywords.add("rsv");
        keywords.add("respiratory syncytial virus");

        keywords.add("fever");
        keywords.add("elevated body temperature");

        keywords.add("head lice");
        keywords.add("lice");
        keywords.add("itchy scalp");

        keywords.add("tick");
        keywords.add("ticks");
        keywords.add("tick-borne encephalitis");
        keywords.add("lyme disease");

        return keywords;
    }
}
