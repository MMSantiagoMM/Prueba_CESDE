package com.example.pruebaCesde.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Optional;


@Document(collection = "Curso")
public class Curso {

    @Id
    private String nombreCurso;

    private String description;

    private Integer duracionCurso;

    private Double precioCurso;

    private LocalDateTime fechaYHora;

    private Docente docente;


    public Curso() {
    }

    public Curso(String nombreCurso, Docente docente, String description, Integer duracionCurso, Double precioCurso, LocalDateTime fechaYHora) {
        this.nombreCurso = nombreCurso;
        this.docente = docente;
        this.description = description;
        this.duracionCurso = duracionCurso;
        this.precioCurso = precioCurso;
        this.fechaYHora = fechaYHora;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public Double getPrecioCurso() {
        return precioCurso;
    }

    public void setPrecioCurso(Double precioCurso) {
        this.precioCurso = precioCurso;
    }

    public Integer getDuracionCurso() {
        return duracionCurso;
    }

    public void setDuracionCurso(Integer duracionCurso) {
        this.duracionCurso = duracionCurso;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
}
