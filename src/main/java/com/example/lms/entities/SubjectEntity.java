package com.example.lms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subject")
public class SubjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "enrolledSubjects")
    private Set<StudentEntity> registeredStudents = new HashSet<>();

    @OneToMany(mappedBy = "subject")
    private Set<ExamEntity> exams = new HashSet<>();
}
