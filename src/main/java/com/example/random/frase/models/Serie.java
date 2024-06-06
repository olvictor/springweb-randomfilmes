package com.example.random.frase.models;

import jakarta.persistence.*;

@Entity
@Table(name= "series")

public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String frase;
    private String personagem;
    private String poster;
}
