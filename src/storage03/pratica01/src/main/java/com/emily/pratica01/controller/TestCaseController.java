package com.emily.pratica01.controller;

import com.emily.pratica01.model.TestCase;
import com.emily.pratica01.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/testcases")
public class TestCaseController {

    @Autowired
    private TestCaseService service;

    @PostMapping("/new")
    public ResponseEntity<TestCase> save(@RequestBody TestCase testCase) {
        TestCase newTest = service.save(testCase);

        if (newTest != null) {
            return ResponseEntity.ok(newTest);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping()
    public ResponseEntity<List<TestCase>> findAllTest() {
        List<TestCase> listAllTest = service.findAllTests();
        return  ResponseEntity.ok(listAllTest);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestCase> findById(@PathVariable long id) {
        TestCase testcase = service.findById(id);

        return ResponseEntity.ok(testcase);
    }

    @PutMapping()
    public ResponseEntity<TestCase> update (@RequestBody TestCase testCase) {
        TestCase testUpdated = service.update(testCase);

        return ResponseEntity.ok(testUpdated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
