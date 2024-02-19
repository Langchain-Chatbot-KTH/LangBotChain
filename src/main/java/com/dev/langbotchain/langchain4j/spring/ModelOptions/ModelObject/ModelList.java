package com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject;

import java.util.ArrayList;

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
        System.out.println();
        System.out.println("All Available Models:");
        for (Model model : models) {
            System.out.println("Model Name: " + model.getName());
            System.out.println("Model Properties: " + model.getSupportedMethods());
            System.out.println("Model Docker Image: " + model.getLangchain4JDockerPath());
            System.out.println("Model Size: " + model.getSize() + " GB");
            System.out.println("---------------------------");
        }
        System.out.println();
    }
}
