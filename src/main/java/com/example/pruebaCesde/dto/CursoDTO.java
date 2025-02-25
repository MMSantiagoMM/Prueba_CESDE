package com.example.pruebaCesde.dto;

public class CursoDTO {

    private String nombreCurso;

    private String description;

    private Integer duracionCurso;

    private Double precioCurso;

    private String fechaYHora;

    private String documentoDocente;


    public CursoDTO() {
    }

    public CursoDTO(String nombreCurso, String documentoDocente, String fechaYHora, Double precioCurso, Integer duracionCurso, String description) {
        this.nombreCurso = nombreCurso;
        this.documentoDocente = documentoDocente;
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

    public String getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(String fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public String getDocumentoDocente() {
        return documentoDocente;
    }

    public void setDocumentoDocente(String documentoDocente) {
        this.documentoDocente = documentoDocente;
    }
}
