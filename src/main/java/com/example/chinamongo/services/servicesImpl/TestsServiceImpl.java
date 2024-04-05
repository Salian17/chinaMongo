package com.example.chinamongo.services.servicesImpl;

import com.example.chinamongo.models.Tests;
import com.example.chinamongo.repository.TestsRepository;
import com.example.chinamongo.services.TestsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestsServiceImpl implements TestsService {
    private final TestsRepository testsRepository;

    public TestsServiceImpl(TestsRepository testsRepository) {
        this.testsRepository = testsRepository;
    }

    @Override
    public List<Tests> getAllTests() {
        return testsRepository.findAll();
    }

    @Override
    public Optional<Tests> getTest(String id) {
        return testsRepository.findById(id);
    }

    @Override
    public Tests createTest(Tests test) {
        return testsRepository.save(test);
    }

    @Override
    public void deleteTest(String id) {
        testsRepository.deleteById(id);
    }
}
