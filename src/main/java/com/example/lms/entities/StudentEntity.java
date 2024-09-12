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
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;

    private String name;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "student_enrolled_subjects",
            joinColumns = {
                    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "subject_id", referencedColumnName = "subject_id")
            }
    )
    private Set<SubjectEntity> enrolledSubjects = new HashSet<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "student_registered_exams",
            joinColumns = {
                    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "exam_id", referencedColumnName = "exam_id")
            }
    )
    private Set<ExamEntity> registeredExams = new HashSet<>();
}
