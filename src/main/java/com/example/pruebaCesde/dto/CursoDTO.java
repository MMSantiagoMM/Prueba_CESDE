package com.example.pruebaCesde.dto;

import com.example.pruebaCesde.entities.Docente;

import java.time.LocalDateTime;

public class CursoDTO {

    private String nombreCurso;

    private String description;

    private Integer duracionCurso;

    private Double precioCurso;

    private LocalDateTime fechaYHora;

    private Docente docente;


    public CursoDTO() {
    }

    public CursoDTO(String nombreCurso, Docente docente, LocalDateTime fechaYHora, Double precioCurso, Integer duracionCurso, String description) {
        this.nombreCurso = nombreCurso;
        this.docente = docente;
        this.fechaYHora = fechaYHora;
        this.precioCurso = precioCurso;
        this.duracionCurso = duracionCurso;
        this.description = description;
    }


    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuracionCurso() {
        return duracionCurso;
    }

    public void setDuracionCurso(Integer duracionCurso) {
        this.duracionCurso = duracionCurso;
    }

    public Double getPrecioCurso() {
        return precioCurso;
    }

    public void setPrecioCurso(Double precioCurso) {
        this.precioCurso = precioCurso;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
