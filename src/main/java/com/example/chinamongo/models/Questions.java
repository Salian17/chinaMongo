package com.example.chinamongo.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

public class Questions {
    private String question;
    private List<Integer> correctOptions;
    private List<String> options;

    public Questions() {
    }

    public Questions(String question, List<Integer> correctOptions, List<String> options) {
        this.question = question;
        this.correctOptions = correctOptions;
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }


    public List<Integer> getCorrectOptions() {
        return correctOptions;
    }

    public void setCorrectOptions(List<Integer> correctOptions) {
        this.correctOptions = correctOptions;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "question='" + question + '\'' +
                ", correctOptions=" + correctOptions +
                '}';
    }
}
