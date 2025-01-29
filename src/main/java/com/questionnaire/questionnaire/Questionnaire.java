package com.questionnaire.questionnaire;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Map;

@Entity
@Data
public class Questionnaire {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String name;
    private String surname;
    private String patronymic;

    @Column(name = "year_of_birth")
    private LocalDate yearOfBirth;

    private String country;
    private String city;
    private boolean married;

    @Column(name = "spouse_name")
    private String spouseName;

    @Column(name = "spouse_surname")
    private String spouseSurname;

    @Column(name = "spouse_patronymic")
    private String spousePatronymic;

    @Column(name = "job_experience")
    private String jobExperience;

    @Column(name = "job_location")
    private String jobLocation;

    private boolean status;
    private boolean children;

    @Column(name = "children_info")
    @Convert(converter = JsonConverter.class)
    private Map<String, Object> childrenInfo;

    @Column(name = "year_of_entering")
    private Integer yearOfEntering;

    @Column(name = "year_of_graduation")
    private Integer yearOfGraduation;

}
