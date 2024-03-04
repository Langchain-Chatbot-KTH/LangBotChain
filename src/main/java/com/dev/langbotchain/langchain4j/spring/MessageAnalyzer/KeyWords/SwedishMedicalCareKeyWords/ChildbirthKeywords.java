package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords;

import java.util.ArrayList;
import java.util.List;

public class ChildbirthKeywords {

    public static List<String> getChildbirthKeywords() {
        List<String> keywords = new ArrayList<>();

        keywords.add("childbirth");
        keywords.add("giving birth through the vagina");
        keywords.add("when should i go to the maternity ward?");
        keywords.add("maternity ward?");
        keywords.add("maternity ward – where you go when it is time to give birth");
        keywords.add("give birth");
        keywords.add("inducing labour");
        keywords.add("birthing positions");
        keywords.add("bleeding after giving birth");
        keywords.add("vaginal tears in childbirth");
        keywords.add("uterine infection after childbirth");
        keywords.add("leaving hospital and the initial time period after childbirth");
        keywords.add("prolapse after giving birth");
        keywords.add("visit to the midwifery clinic after you have given birth");
        keywords.add("your feelings about your childbirth experience");
        keywords.add("postpartum");
        keywords.add("postnatal care");
        keywords.add("maternity");
        keywords.add("obstetrics");
        keywords.add("labour");

        return keywords;
    }

    public static String getChildbirthFileName(){
        return "1177Childbirth.txt";
    }
}
