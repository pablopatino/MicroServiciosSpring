package com.springboot.backend.microservices.app.usuarios.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.backend.microservices.app.commonsalumnos.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
