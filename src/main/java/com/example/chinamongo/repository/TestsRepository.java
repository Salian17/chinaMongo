package com.example.chinamongo.repository;

import com.example.chinamongo.models.Tests;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestsRepository extends MongoRepository<Tests, String> {
}
