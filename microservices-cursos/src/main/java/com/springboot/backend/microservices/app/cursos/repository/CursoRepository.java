package com.springboot.backend.microservices.app.cursos.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.backend.microservices.app.cursos.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {

}
