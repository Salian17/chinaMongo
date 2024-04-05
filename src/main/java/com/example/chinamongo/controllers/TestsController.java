package com.example.chinamongo.controllers;

import com.example.chinamongo.models.Tests;
import com.example.chinamongo.services.TestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tests")
public class TestsController {
    @Autowired
    private TestsService testsService;
    @GetMapping("/all")
    List<Tests> all(){return testsService.getAllTests();}
    @GetMapping("/")
    Optional<Tests> get(@RequestParam String id){return testsService.getTest(id);}
    @PostMapping("/create")
    Tests create(@RequestBody Tests test){return testsService.createTest(test);}
    @DeleteMapping("/")
    void delete(@RequestParam String id){testsService.deleteTest(id);}
}
