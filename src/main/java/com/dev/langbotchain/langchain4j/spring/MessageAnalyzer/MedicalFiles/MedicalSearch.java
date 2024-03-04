package com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.MedicalFiles;

import java.io.IOException;
import java.util.List;

import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.DocsAnalyzer.DocumentToTextGenerationAnalyzer.generateTextWithDocumentAnalyzer;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.Code.CODING_KEYWORDS;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.MathCode.MATH_KEYWORDS;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.ChildCareKeywords.getChildCareFileName;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.ChildCareKeywords.getChildCareKeywords;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.ChildbirthKeywords.getChildbirthFileName;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.ChildbirthKeywords.getChildbirthKeywords;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.Covid19TelephoneServiceKeywords.getCovid19TelephoneServiceFileName;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.Covid19TelephoneServiceKeywords.getCovid19TelephoneServiceKeywords;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.DentalCareKeywords.getDentalCareFileName;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.DentalCareKeywords.getDentalCareKeywords;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.ExaminationsKeywords.getExaminationsKeywords;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.ExaminationsKeywords.getTestsFileName;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.InterpretationKeyWords.getInterpretationFileName;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.InterpretationKeyWords.interpretationKeyWords;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.KeywordsListMentalHealth.getMentalHealthFileName;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.KeywordsListMentalHealth.keywordsListMentalHealth;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.KeywordsListseekHealthcareKeyWords.getSeekHealthcareFileName;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.KeywordsListseekHealthcareKeyWords.keywordsListseekHealthcareKeyWords;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.PregnancyKeywords.getPregnancyFileName;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.PregnancyKeywords.getPregnancyKeywords;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.SymptomsAndDiseaseKeyWords.GetSymptomsAndDiseaseFileName;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.KeyWords.SwedishMedicalCareKeyWords.SymptomsAndDiseaseKeyWords.keywordsListSymptomsAndDisease;
import static com.dev.langbotchain.langchain4j.spring.MessageAnalyzer.MedicalFiles.FileOptions.LoadFile.loadFile;

public class MedicalSearch {
    public static String findSuitableMedicalFile(String question, String uuid, int id) throws IOException {

        String documentModel = "llama2";

        String lowercaseQuestion = question.toLowerCase();

        if (lowercaseQuestion.contains("1177")) {

            List<String> symptomsAndDiseaseKeyWords = keywordsListSymptomsAndDisease();
            if (containsKeyword(lowercaseQuestion, symptomsAndDiseaseKeyWords)) {
                generateTextWithDocumentAnalyzer(question, loadFile(GetSymptomsAndDiseaseFileName()), documentModel, uuid, id);
                return "running";
            }

            List<String> seekHealthcareKeyWords = keywordsListseekHealthcareKeyWords();
            if (containsKeyword(lowercaseQuestion, seekHealthcareKeyWords)) {
                generateTextWithDocumentAnalyzer(question, loadFile(getSeekHealthcareFileName()), documentModel, uuid, id);
                return "running";
            }

            List<String> mentalHealthKeyWords = keywordsListMentalHealth();
            if (containsKeyword(lowercaseQuestion, mentalHealthKeyWords)) {
                generateTextWithDocumentAnalyzer(question, loadFile(getMentalHealthFileName()), documentModel, uuid, id);
                return "running";
            }

            List<String> childBirthKeyWords = getChildbirthKeywords();
            if (containsKeyword(lowercaseQuestion, childBirthKeyWords)) {
                generateTextWithDocumentAnalyzer(question, loadFile(getChildbirthFileName()), documentModel, uuid, id);
                return "running";
            }

            List<String> childCareKeyWords = getChildCareKeywords();
            if (containsKeyword(lowercaseQuestion, childCareKeyWords)) {
                generateTextWithDocumentAnalyzer(question, loadFile(getChildCareFileName()), documentModel, uuid, id);
                return "running";
            }

            List<String> covid19AdviceKeyWords = getCovid19TelephoneServiceKeywords();
            if (containsKeyword(lowercaseQuestion, covid19AdviceKeyWords)) {
                generateTextWithDocumentAnalyzer(question, loadFile(getCovid19TelephoneServiceFileName()), documentModel, uuid, id);
                return "running";
            }

            List<String> dentalCareKeyWords = getDentalCareKeywords();
            if (containsKeyword(lowercaseQuestion, dentalCareKeyWords)) {
                generateTextWithDocumentAnalyzer(question, loadFile(getDentalCareFileName()), documentModel, uuid, id);
                return "running";
            }

            List<String> testsKeyWords = getExaminationsKeywords();
            if (containsKeyword(lowercaseQuestion, testsKeyWords)) {
                generateTextWithDocumentAnalyzer(question, loadFile(getTestsFileName()), documentModel, uuid, id);
                return "running";
            }

            List<String> interpretationKeyWordsList = interpretationKeyWords();
            if (containsKeyword(lowercaseQuestion, interpretationKeyWordsList)) {
                generateTextWithDocumentAnalyzer(question, loadFile(getInterpretationFileName()), documentModel, uuid, id);
                return "running";
            }

            List<String> pregnancyWords = getPregnancyKeywords();
            if (containsKeyword(lowercaseQuestion, pregnancyWords)) {
                generateTextWithDocumentAnalyzer(question, loadFile(getPregnancyFileName()), documentModel, uuid, id);
                return "running";
            }

            if (!containsKeyword(lowercaseQuestion, CODING_KEYWORDS) && !containsKeyword(lowercaseQuestion, MATH_KEYWORDS)) {
                generateTextWithDocumentAnalyzer(question, loadFile("1177InfoSum.txt"), documentModel, uuid, id);
                return "running";
            }
        }
        return "llama2";
    }

    private static boolean containsKeyword(String question, List<String> keywords) {
        for (String keyword : keywords) {
            if (question.contains(keyword.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
