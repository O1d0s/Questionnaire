package com.questionnaire.questionnaire;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionnaireRepository extends JpaRepository<Questionnaire, String> {
    List<Questionnaire> findByUserId(String userId);
}
