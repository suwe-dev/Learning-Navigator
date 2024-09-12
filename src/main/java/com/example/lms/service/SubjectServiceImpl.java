package com.example.lms.service;

import com.example.lms.entities.SubjectEntity;
import com.example.lms.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<SubjectEntity> findAll() {
        return subjectRepository.findAll();
    }

    @Override
    public SubjectEntity saveUser(SubjectEntity subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Optional<SubjectEntity> findById(Long subject_id) {
        return subjectRepository.findById(subject_id);
    }
}
