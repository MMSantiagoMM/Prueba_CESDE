package com.example.pruebaCesde.repositories;

import com.example.pruebaCesde.entities.Docente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DocenteRepositorio extends MongoRepository<Docente,String> {

    Optional<Docente> findByDocumento(String documento);
}
