package com.example.pruebaCesde.service;

import com.example.pruebaCesde.dto.CursoDTO;
import com.example.pruebaCesde.dto.DocenteDTO;
import com.example.pruebaCesde.entities.Curso;
import com.example.pruebaCesde.entities.Docente;
import com.example.pruebaCesde.repositories.CursoRepositorio;
import com.example.pruebaCesde.repositories.DocenteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class CursoServicio {


    @Autowired
    private CursoRepositorio cursoRepositorio;

    @Autowired
    private DocenteRepositorio docenteRepositorio;



    public Curso crearCurso(CursoDTO dto){

        Curso curso = new Curso();

        curso.setNombreCurso(dto.getNombreCurso());
        curso.setDescription(dto.getDescription());
        curso.setDuracionCurso(dto.getDuracionCurso());
        curso.setPrecioCurso(dto.getPrecioCurso());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dto.getFechaYHora(), formatter);
        curso.setFechaYHora(dateTime);
        curso.setDocente(docenteRepositorio.findByDocumento(dto.getDocente()).get());

        return cursoRepositorio.save(curso);

    }

    public Optional<Curso> obtenerCurso(String nombre){
        return Optional.of(cursoRepositorio.findById(nombre)).orElseThrow(()-> new RuntimeException());
    }

    public List<Curso> obtenerTodos(){
        return cursoRepositorio.findAll();
    }



    public Curso actualizarCurso(CursoDTO dto, String nombre) {
        return cursoRepositorio.findById(nombre)
                .map(curso -> {
                    curso.setNombreCurso(dto.getNombreCurso());
                    curso.setDescription(dto.getDescription());
                    curso.setDuracionCurso(dto.getDuracionCurso());
                    curso.setPrecioCurso(dto.getPrecioCurso());
                    //curso.setFechaYHora(dto.getFechaYHora());
                    curso.setDocente(docenteRepositorio.findByDocumento(dto.getDocente()).get());

                    return cursoRepositorio.save(curso);
                })
                .orElseThrow(() -> new RuntimeException("Curso no encontrado con nombre: " + nombre));
    }

    public Boolean eliminar(String nombre){
        if(cursoRepositorio.existsById(nombre)){
            cursoRepositorio.deleteById(nombre);
            return true;
        }else{
            return false;
        }



}}
