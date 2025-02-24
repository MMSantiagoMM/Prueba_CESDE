package com.example.pruebaCesde.controllers;


import com.example.pruebaCesde.dto.CursoDTO;
import com.example.pruebaCesde.dto.DocenteDTO;
import com.example.pruebaCesde.entities.Curso;
import com.example.pruebaCesde.entities.Docente;
import com.example.pruebaCesde.service.CursoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/curso")
public class CursoController {

    @Autowired
    private final CursoServicio servicio;

    public CursoController(CursoServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<Curso> obtenerCurso(String nombre) {
        return servicio.obtenerCurso(nombre).map(curso -> new ResponseEntity<>(curso, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Curso>> obtenerTodos() {
        return new ResponseEntity<>(servicio.obtenerTodos(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Curso> crear(CursoDTO dto) {
        return new ResponseEntity<>(servicio.crearCurso(dto), HttpStatus.CREATED);
    }

    @PutMapping("/{nombre}")
    public ResponseEntity<Curso> actualizar (@PathVariable String nombre, @RequestBody CursoDTO dto) {
        try {
            Curso actualizarCurso = servicio.actualizarCurso(dto, nombre);
            return ResponseEntity.ok(actualizarCurso);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{nombre}")
    public ResponseEntity<Void> eliminar(String nombre) {
        if(servicio.eliminar(nombre)){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
