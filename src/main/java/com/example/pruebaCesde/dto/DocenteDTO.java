package com.example.pruebaCesde.dto;

public class DocenteDTO {

    private String documento;

    private String nombre;

    private String correo;


    public DocenteDTO() {
    }

    public DocenteDTO(String documento, String correo, String nombre) {
        this.documento = documento;
        this.correo = correo;
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
