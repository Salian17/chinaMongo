package com.example.chinamongo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "topics")
public class Topics {
    @Id
    private String id;
    private List<TopicTitle> topicTitles;

    public Topics() {
    }

    public Topics(String id, List<TopicTitle> topicTitles) {
        this.id = id;
        this.topicTitles = topicTitles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<TopicTitle> getTopicTitles() {
        return topicTitles;
    }

    public void setTopicTitles(List<TopicTitle> topicTitles) {
        this.topicTitles = topicTitles;
    }

    @Override
    public String toString() {
        return "Topics{" +
                "id='" + id + '\'' +
                ", topicTitles=" + topicTitles +
                '}';
    }
}
