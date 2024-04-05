package com.example.chinamongo.repository;

import com.example.chinamongo.models.Topics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicsRepository extends MongoRepository<Topics, String> {
}
