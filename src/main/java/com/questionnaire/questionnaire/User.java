package com.questionnaire.questionnaire;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)
    private long id;

    @Column(nullable = false)
    private String name, email, password_hash;

    @Enumerated(EnumType.STRING)
    private String role;

    public enum Role{
        USER,
        ADMIN
    }

}
