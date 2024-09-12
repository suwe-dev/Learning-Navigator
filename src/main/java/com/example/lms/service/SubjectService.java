package com.example.lms.service;

import com.example.lms.entities.StudentEntity;
import com.example.lms.entities.SubjectEntity;

import java.util.List;
import java.util.Optional;

public interface SubjectService {
    List<SubjectEntity> findAll();
    SubjectEntity saveUser(SubjectEntity subject);
    Optional<SubjectEntity> findById(Long subject_id);
}
