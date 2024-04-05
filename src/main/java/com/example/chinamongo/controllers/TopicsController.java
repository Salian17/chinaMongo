package com.example.chinamongo.controllers;

import com.example.chinamongo.models.Topics;
import com.example.chinamongo.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/topics")
public class TopicsController {
    @Autowired
    private TopicService topicService;
    @GetMapping("/all")
    List<Topics> all(){return topicService.getAllTopics();}
    @GetMapping("/")
    Optional<Topics> get(@RequestParam String id){return topicService.getTopic(id);}
    @PostMapping("/create")
    Topics create(@RequestBody Topics topics){return topicService.createTopic(topics);}
    @DeleteMapping("/")
    void delete(@RequestParam String id){topicService.deleteTopic(id);}
}
