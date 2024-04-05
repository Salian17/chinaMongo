package com.example.chinamongo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "tests")
public class Tests {
    @Id
    private String id;
    private String testName;
    private List<Questions> questions;

    public Tests() {
    }

    public Tests(String id, String testName, List<Questions> questions) {
        this.id = id;
        this.testName = testName;
        this.questions = questions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Tests{" +
                "id='" + id + '\'' +
                ", testName='" + testName + '\'' +
                ", questions=" + questions +
                '}';
    }
}

