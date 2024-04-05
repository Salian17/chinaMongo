package com.example.chinamongo.services;

import com.example.chinamongo.models.Topics;

import java.util.List;
import java.util.Optional;

public interface TopicService {
    List<Topics> getAllTopics();
    Optional<Topics> getTopic(String id);
    Topics createTopic(Topics topic);
    void deleteTopic(String id);
}
