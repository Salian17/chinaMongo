package com.example.chinamongo.models;


import java.util.List;

public class TopicTitle {
    private String text;
    private List<TopicContent> topicContents;

    public TopicTitle() {
    }

    public TopicTitle(String text, List<TopicContent> topicContents) {
        this.text = text;
        this.topicContents = topicContents;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<TopicContent> getTopicContents() {
        return topicContents;
    }

    public void setTopicContents(List<TopicContent> topicContents) {
        this.topicContents = topicContents;
    }

    @Override
    public String toString() {
        return "TopicTitle{" +
                "text='" + text + '\'' +
                ", topicContents=" + topicContents +
                '}';
    }
}
