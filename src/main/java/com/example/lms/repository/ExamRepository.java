package com.example.lms.repository;

import com.example.lms.entities.ExamEntity;
import com.example.lms.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<ExamEntity, Long> {
}
