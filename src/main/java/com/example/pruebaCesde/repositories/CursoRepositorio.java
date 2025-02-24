package com.example.pruebaCesde.repositories;

import com.example.pruebaCesde.entities.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepositorio extends MongoRepository<Curso,String> {
}
