package com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject;

import io.netty.util.internal.SocketUtils;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import static com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.AsciiModelText.modelPrint;
import static com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject.AsciiModelText.modelWrite;
import static com.dev.langbotchain.langchain4j.spring.ModelOptions.OllamaModel.PopulateOllamaModels.populateOllamaModels;

public class ModelList {
    static ArrayList<Model> models = new ArrayList<>();

    public static void populateModels(){
        populateOllamaModels(models);
    }

    public static Model findModelByName(String modelName) {
        for (Model model : models) {
            if (model.getName().equalsIgnoreCase(modelName)) {
                return model;
            }
        }
        System.out.println("Model not Supported, llama2 default");
        return findModelByName("llama2");
    }

    public static void displayAllModels() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("./src/main/resources/Documents/models.txt"))) {
            writer.println();
            System.out.println();
            for (Model model : models) {
                modelPrint(model.getName());
                modelWrite(model.getName(), writer);
                writer.println("Model Name: " + model.getName());
                writer.println("Model Properties: " + model.getSupportedMethods());
                writer.println("Model Docker Image: " + model.getLangchain4JDockerPath());
                writer.println("Model Size: " + model.getSize() + " GB");
                writer.println("---------------------------");
                System.out.println("Model Name: " + model.getName());
                System.out.println("Model Properties: " + model.getSupportedMethods());
                System.out.println("Model Docker Image: " + model.getLangchain4JDockerPath());
                System.out.println("Model Size: " + model.getSize() + " GB");
                System.out.println("---------------------------");
            }
            writer.println();
            System.out.println();
            printRamNeed(models, writer);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void printRamNeed(ArrayList<Model> models, PrintWriter writer) {
        ArrayList<Double> ramList = new ArrayList<>();
        for (Model model : models) {
            if (!ramList.contains(model.getSize())) {
                ramList.add(model.getSize());
            }
        }
        Collections.sort(ramList);
        calcRamNeed(ramList, writer);
    }

    private static void calcRamNeed(ArrayList<Double> ramList, PrintWriter writer) {
        String boxTop = "+" + repeatChar('-', 60) + "+";
        int boxTopLen = boxTop.length();
        int boxMiddleLen;
        writer.println(boxTop);
        System.out.println(boxTop);
        for (Double size : ramList) {
            double ramNeedLower = size * (100 / (100 - getModelPercentageLower(size)));
            double ramNeedUpper = size * (100 / (100 - getModelPercentageUpper(size)));

            String boxMiddle = "| Model size: " + formatDecimal(size) + "GB ==> RAM needs: " + formatDecimal(ramNeedLower) + " - " + formatDecimal(ramNeedUpper) + " GB";
            writer.print(boxMiddle);
            System.out.print(boxMiddle);
            boxMiddleLen = boxMiddle.length();
            printEndLine(boxTopLen, boxMiddleLen, writer);
            writer.println();
            System.out.println();
        }
        String boxBottom = "+" + repeatChar('-', 60) + "+";
        writer.println(boxBottom);
        System.out.println(boxBottom);
    }

    private static void printEndLine(int boxTopLen, int boxMiddleLen, PrintWriter writer) {
        int diff = boxTopLen - boxMiddleLen;
        for (int i = 0; i < diff - 1; diff--) {
            writer.print(" ");
            System.out.print(" ");
        }
        writer.print("|");
        System.out.print("|");
    }

    private static String formatDecimal(double value) {
        return String.format("%.3f", value);
    }

    private static String repeatChar(char ch, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }

    private static double getModelPercentageLower(double size) {
        if (size <= 3.8) {
            return 37.5;
        } else if (size <= 7.4) {
            return 36.5;
        } else if (size <= 39) {
            return 50;
        } else if (size <= 110) {
            return 55;
        } else {
            return 0;
        }
    }

    private static double getModelPercentageUpper(double size) {
        if (size <= 3.8) {
            return 42.5;
        } else if (size <= 7.4) {
            return 42.5;
        } else if (size <= 39) {
            return 62;
        } else if (size <= 110) {
            return 67;
        } else {
            return 0;
        }
    }
}
