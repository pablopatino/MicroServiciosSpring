package com.springboot.backend.microservices.app.cursos.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.microservices.app.cursos.models.entity.Curso;
import com.springboot.backend.microservices.app.cursos.services.CursoService;
import com.springboot.backend.microservices.commons.controllers.CommonController;

@RestController
public class CursoController extends CommonController<Curso, CursoService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> putCurso(@RequestBody Curso curso,@PathVariable Long id){
		Optional<Curso> o = this.alumnoService.findById(id);
		
		if (!o.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encuentra en la BD");
		}
		
		Curso dbCurso = o.get();
		dbCurso.setNombre(curso.getNombre());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(this.alumnoService.crearAlumno(dbCurso));
	}
	
}
