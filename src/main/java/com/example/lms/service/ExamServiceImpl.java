package com.example.lms.service;

import com.example.lms.entities.ExamEntity;
import com.example.lms.entities.SubjectEntity;
import com.example.lms.exception.ResourceNotFoundException;
import com.example.lms.repository.ExamRepository;
import com.example.lms.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamServiceImpl implements ExamService{

    @Autowired
    private ExamRepository examRepository;
    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<ExamEntity> findAll() {
        return examRepository.findAll();
    }

    @Override
    public ExamEntity saveUser(Long subject_id) {
        SubjectEntity subject = subjectRepository.findById(subject_id)
                .orElseThrow(() -> new ResourceNotFoundException("Subject not found"));
        ExamEntity exam = new ExamEntity();
        exam.setSubject(subject);
        return examRepository.save(exam);
    }

    @Override
    public Optional<ExamEntity> findById(Long exam_id) {
        return examRepository.findById(exam_id);
    }

    @Override
    public ExamEntity enrollExam(ExamEntity examEntity) {
        return null;
    }
}
