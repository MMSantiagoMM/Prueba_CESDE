package com.example.pruebaCesde.service;

import com.example.pruebaCesde.dto.DocenteDTO;
import com.example.pruebaCesde.entities.Docente;
import com.example.pruebaCesde.repositories.DocenteRepositorio;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteServicio {

    @Autowired
    private final DocenteRepositorio docenteRepositorio;


    public DocenteServicio(DocenteRepositorio docenteRepositorio) {
        this.docenteRepositorio = docenteRepositorio;
    }


    public Optional<Docente> obtenerDocente(String documento){
        return Optional.of(docenteRepositorio.findByDocumento(documento)).orElseThrow(()-> new RuntimeException());
    }

    public List<Docente> obtenerTodos(){
        return docenteRepositorio.findAll();
    }

    public Docente crearDocente(DocenteDTO dto){
        Docente docente = new Docente();

        docente.setDocumento(dto.getDocumento());
        docente.setNombre(dto.getNombre());
        docente.setCorreo(dto.getCorreo());

        return docenteRepositorio.save(docente);
    }

    public Docente actualizarDocente(DocenteDTO dto, String documento) {
        return docenteRepositorio.findByDocumento(documento)
                .map(docente -> {
                    docente.setNombre(dto.getNombre());
                    docente.setCorreo(dto.getCorreo());

                    return docenteRepositorio.save(docente);
                })
                .orElseThrow(() -> new RuntimeException("Docente no encontrado con documento: " + documento));
    }

    public Boolean eliminar(String documento){
        if(docenteRepositorio.existsById(documento)){
            docenteRepositorio.deleteById(documento);
            return true;
        }else{
            return false;
        }

    }




}
