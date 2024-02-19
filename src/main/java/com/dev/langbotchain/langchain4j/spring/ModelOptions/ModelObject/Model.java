package com.dev.langbotchain.langchain4j.spring.ModelOptions.ModelObject;

import java.util.ArrayList;

public class Model {
    private final String name;
    private final ArrayList<SupportedModelProperties> supportedMethods;
    private final String langchain4JDockerPath;
    private final double size;

    public Model(String name, ArrayList<SupportedModelProperties> supportedMethods, String langchain4JDockerPath, double size){
        this.name = name;
        this.supportedMethods = supportedMethods;
        this.langchain4JDockerPath = langchain4JDockerPath;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public ArrayList<SupportedModelProperties> getSupportedMethods() {
        return supportedMethods;
    }

    public String getLangchain4JDockerPath() {
        return langchain4JDockerPath;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", supportedMethods=" + supportedMethods +
                ", langchain4JDockerPath='" + langchain4JDockerPath + '\'' +
                ", Size='" + size +
                '}';
    }
}
