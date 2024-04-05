package com.example.chinamongo.services;

import com.example.chinamongo.models.Tests;

import java.util.List;
import java.util.Optional;

public interface TestsService {
    List<Tests> getAllTests();
    Optional<Tests> getTest(String id);
    Tests createTest(Tests test);
    void deleteTest(String id);
}
