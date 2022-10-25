package com.emily.pratica01.service;

import com.emily.pratica01.model.TestCase;
import com.emily.pratica01.repository.TestCaseRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestCaseService implements ITestCase {

    @Autowired
    private TestCaseRepo repo;

    @Override
    public TestCase save(TestCase testCase) {
        return repo.save(testCase);
    }

    @Override
    public List<TestCase> findAllTests() {
        return repo.findAll();
    }

    @Override
    public TestCase findById(long id) {

        return repo.findById(id).orElse(null);
    }

    @Override
    public TestCase update(TestCase testCase) {
        return repo.save(testCase);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
