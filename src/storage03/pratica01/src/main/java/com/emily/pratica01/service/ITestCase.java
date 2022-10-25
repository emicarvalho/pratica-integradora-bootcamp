package com.emily.pratica01.service;

import com.emily.pratica01.model.TestCase;

import java.util.List;

public interface ITestCase {

     TestCase save(TestCase testCase);

     List<TestCase> findAllTests();

     TestCase findById(long id);

     TestCase update(TestCase testCase);

     void delete(long id);
}
