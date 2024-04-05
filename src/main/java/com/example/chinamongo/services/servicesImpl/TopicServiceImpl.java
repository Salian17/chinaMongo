package com.example.chinamongo.services.servicesImpl;

import com.example.chinamongo.models.Topics;
import com.example.chinamongo.repository.TopicsRepository;
import com.example.chinamongo.services.TopicService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicServiceImpl implements TopicService {
    private final TopicsRepository topicsRepository;

    public TopicServiceImpl(TopicsRepository topicsRepository) {
        this.topicsRepository = topicsRepository;
    }

    @Override
    public List<Topics> getAllTopics() {
        return topicsRepository.findAll();
    }

    @Override
    public Optional<Topics> getTopic(String id) {
        return topicsRepository.findById(id);
    }

    @Override
    public Topics createTopic(Topics topic) {
        return topicsRepository.save(topic);
    }

    @Override
    public void deleteTopic(String id) {
        topicsRepository.deleteById(id);
    }
}
