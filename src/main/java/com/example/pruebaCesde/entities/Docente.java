package com.example.pruebaCesde.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Docente {

    @Id
    private String documento;

    private String nombre;

    private String correo;

}
