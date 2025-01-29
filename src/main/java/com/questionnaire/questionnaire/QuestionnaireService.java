package com.questionnaire.questionnaire;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionnaireService {
    private final QuestionnaireRepository repository;

    public QuestionnaireService(QuestionnaireRepository repository){
        this.repository = repository;
    }

    public List<Questionnaire> getAll(){
        return repository.findAll();
    }

    public Optional<Questionnaire> getById(String id){
        return repository.findById(id);
    }

    public List<Questionnaire> getByUserId(String userId){
        return repository.findByUserId(userId);
    }

    public Questionnaire save(Questionnaire questionnaire){
        return repository.save(questionnaire);
    }

    public void delete(String id){
        repository.deleteById(id);
    }
}
