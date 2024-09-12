package com.example.lms.service;

import com.example.lms.entities.ExamEntity;
import com.example.lms.entities.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface ExamService {
    List<ExamEntity> findAll();
    ExamEntity saveUser(Long id);
    Optional<ExamEntity> findById(Long exam_id);
    ExamEntity enrollExam(ExamEntity examEntity);
}
