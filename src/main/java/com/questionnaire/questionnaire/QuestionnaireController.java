package com.questionnaire.questionnaire;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/questionnaire")
public class QuestionnaireController {
    private final QuestionnaireService service;

    public QuestionnaireController(QuestionnaireService service){
        this.service = service;
    }

    @GetMapping
    public List<Questionnaire> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Questionnaire> getById(@PathVariable String id){
        Optional<Questionnaire> questionnaire = service.getById(id);
        return questionnaire.map(ResponseEntity::ok).orElseGet(() ->ResponseEntity.notFound().build());
    }

    @PostMapping
    public Questionnaire create(@RequestBody Questionnaire questionnaire){
        return service.save(questionnaire);
    }
}
