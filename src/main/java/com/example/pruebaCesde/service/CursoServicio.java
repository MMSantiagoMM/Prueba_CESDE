package com.example.pruebaCesde.service;

import com.example.pruebaCesde.dto.CursoDTO;
import com.example.pruebaCesde.dto.DocenteDTO;
import com.example.pruebaCesde.entities.Curso;
import com.example.pruebaCesde.entities.Docente;
import com.example.pruebaCesde.repositories.CursoRepositorio;
import org.springframework.stereotype.Service;

@Service
public class CursoServicio {


    private final CursoRepositorio cursoRepositorio;

    public CursoServicio(CursoRepositorio cursoRepositorio) {
        this.cursoRepositorio = cursoRepositorio;
    }

    public Curso crearcurso(CursoDTO dto){

        Curso curso = new Curso();

        curso.setNombreCurso(dto.getNombreCurso());
        curso.setDescription(dto.getDescription());
        curso.setDuracionCurso(dto.getDuracionCurso());
        curso.setPrecioCurso(dto.getPrecioCurso());
        curso.setFechaYHora(dto.getFechaYHora());
        curso.setDocente(dto.getDocente());

        return cursoRepositorio.save(curso);

    }



    public Curso actualizarCurso(CursoDTO dto, String nombre) {
        return cursoRepositorio.findById(nombre)
                .map(curso -> {
                    curso.setNombreCurso(dto.getNombreCurso());
                    curso.setDescription(dto.getDescription());
                    curso.setDuracionCurso(dto.getDuracionCurso());
                    curso.setPrecioCurso(dto.getPrecioCurso());
                    curso.setFechaYHora(dto.getFechaYHora());
                    curso.setDocente(dto.getDocente());

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
