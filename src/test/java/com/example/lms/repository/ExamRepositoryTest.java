package com.example.lms.repository;

import com.example.lms.entities.ExamEntity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ExamRepositoryTest {

    @Autowired
    private ExamRepository examRepository;

    private ExamEntity exam1;
    private ExamEntity exam2;

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
        examRepository.deleteAll();
    }

    @Test
    void test_getAll() {

    }

    @Test
    void test_create() {

    }

    @Test
    void test_getById() {

    }

    @Test
    void test_update() {

    }

    @Test
    void test_delete() {

    }

}
