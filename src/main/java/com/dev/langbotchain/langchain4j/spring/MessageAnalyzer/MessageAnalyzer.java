package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer;

import com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.Code;
import com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.MathCode;
import com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.MedicalCode;
import com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.Sql;

import java.io.IOException;

import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.MedicalFiles.MedicalSearch.findSuitableMedicalFile;

public class MessageAnalyzer {
    public static String findSuitableModel(String message, String uuid, int id) throws IOException {
        String result = findSuitableMedicalFile(message, uuid, id);

        if (!result.equals("llama2")) {
            return "running";
        }

        for (String sentence : MedicalCode.MEDICAL_SENTENCES) {
            if (message.toLowerCase().contains(sentence.toLowerCase())) {
                return "medllama2:7b";
            }
        }

        for (String term : MedicalCode.MEDICAL_KEYWORDS) {
            if (message.toLowerCase().contains(term.toLowerCase())) {
                return "medllama2:7b";
            }
        }

        for (String sentence : MathCode.MATH_SENTENCES) {
            if (message.toLowerCase().contains(sentence.toLowerCase())) {
                return "wizard-math";
            }
        }

        for (String term : MathCode.MATH_KEYWORDS) {
            if (message.toLowerCase().contains(term.toLowerCase())) {
                return "wizard-math";
            }
        }

        for (String sentence : Sql.SQL_SENTENCES) {
            if (message.toLowerCase().contains(sentence.toLowerCase())) {
                return "sqlcoder";
            }
        }

        for (String term : Sql.SQL_KEYWORDS) {
            if (message.toLowerCase().contains(term.toLowerCase())) {
                return "sqlcoder";
            }
        }

        for (String sentence : Code.CODING_SENTENCES) {
            if (message.toLowerCase().contains(sentence.toLowerCase())) {
                return "codellama";
            }
        }

        for (String term : Code.CODING_KEYWORDS) {
            if (message.toLowerCase().contains(term.toLowerCase())) {
                return "codellama";
            }
        }

        if (message.toLowerCase().contains("tell me a funny joke")){
            return "llama2-uncensored";
        }

        return "llama2";
    }
}
