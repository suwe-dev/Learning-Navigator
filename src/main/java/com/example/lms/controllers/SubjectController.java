package com.example.lms.controllers;

import com.example.lms.entities.SubjectEntity;
import com.example.lms.repository.SubjectRepository;
import com.example.lms.service.SubjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectServiceImpl subjectService;

    @GetMapping
    public List<SubjectEntity> findAllUsers() {
        return subjectService.findAll();
    }

    @PostMapping
    public SubjectEntity saveUser(@RequestBody SubjectEntity subject) {
        return subjectService.saveUser(subject);
    }

    @GetMapping("/{id}")
    public Optional<SubjectEntity> findById(@PathVariable Long id) {
        return subjectService.findById(id);
    }

}
