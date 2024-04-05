package com.example.chinamongo.models;

public class TopicContent {
    private String content;
    private String title;

    public TopicContent() {
    }

    public TopicContent(String content, String title) {
        this.content = content;
        this.title = title;
    }


    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "TopicContent{" +
                "content='" + content + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
