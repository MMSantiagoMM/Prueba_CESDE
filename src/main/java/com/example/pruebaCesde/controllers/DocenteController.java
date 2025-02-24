package com.example.pruebaCesde.controllers;


import com.example.pruebaCesde.dto.DocenteDTO;
import com.example.pruebaCesde.entities.Docente;
import com.example.pruebaCesde.service.DocenteServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/docente")
public class DocenteController {


    private final DocenteServicio servicio;


    public DocenteController(DocenteServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/{documento}")
    public ResponseEntity<Docente> obtenerDocente(String documento) {
        return servicio.obtenerDocente(documento).map(docente -> new ResponseEntity<>(docente, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Docente>> obtenerTodos() {
        return new ResponseEntity<>(servicio.obtenerTodos(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Docente> crear(DocenteDTO dto) {
        return new ResponseEntity<>(servicio.crearDocente(dto), HttpStatus.CREATED);
    }

    @PutMapping("/{documento}")
    public ResponseEntity<Docente> actualizar (@PathVariable String documento, @RequestBody DocenteDTO dto) {
        try {
            Docente updatedDocente = servicio.actualizarDocente(dto, documento);
            return ResponseEntity.ok(updatedDocente);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{documento}")
    public ResponseEntity<Void> eliminar(String documento) {
        if(servicio.eliminar(documento)){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

}
