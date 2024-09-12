package com.example.lms.service;

import com.example.lms.entities.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<StudentEntity> findAll();
    StudentEntity saveUser(StudentEntity student);
    Optional<StudentEntity> findById(Long student_id);
    void enrollSubject(Long student_id, Long subject_id);
    void registerExam(Long student_id, Long exam_id);
}
