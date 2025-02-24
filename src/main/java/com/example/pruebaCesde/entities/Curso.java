package com.example.pruebaCesde.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("Curso")
public class Curso {

    @Id
    private String nombreCurso;

    private String description;

    private Integer duracionCurso;

    private Double precioCurso;

    private LocalDateTime fechaYHora;

    private Docente docente;




}
