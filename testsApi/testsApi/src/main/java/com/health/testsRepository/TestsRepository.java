package com.health.testsRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.model.Tests;

public interface TestsRepository extends JpaRepository<Tests, Long>{

}
