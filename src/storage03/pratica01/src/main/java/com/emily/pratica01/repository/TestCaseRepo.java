package com.emily.pratica01.repository;

import com.emily.pratica01.model.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestCaseRepo extends JpaRepository<TestCase, Long> {
}
