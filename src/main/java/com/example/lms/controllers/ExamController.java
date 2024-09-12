package com.example.lms.controllers;

import com.example.lms.entities.ExamEntity;
import com.example.lms.entities.SubjectEntity;
import com.example.lms.exception.ResourceNotFoundException;
import com.example.lms.repository.ExamRepository;
import com.example.lms.repository.SubjectRepository;
import com.example.lms.service.ExamService;
import com.example.lms.service.ExamServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/exam")
public class ExamController {

    @Autowired
    private ExamServiceImpl examService;

    @GetMapping
    public List<ExamEntity> findAllUsers() {
        return examService.findAll();
    }

    @PostMapping("/subject/{subject_id}")
    public ExamEntity saveUser(@PathVariable Long subject_id) {
        return examService.saveUser(subject_id);
    }

    @GetMapping("/{id}")
    public Optional<ExamEntity> findById(@PathVariable Long id) {
        return examService.findById(id);
    }

}
