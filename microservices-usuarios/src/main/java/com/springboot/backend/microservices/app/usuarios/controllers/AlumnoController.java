package com.springboot.backend.microservices.app.usuarios.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.microservices.app.commonsalumnos.models.entity.Alumno;
import com.springboot.backend.microservices.app.usuarios.services.AlumnoServices;
import com.springboot.backend.microservices.commons.controllers.CommonController;

@RestController
public class AlumnoController extends CommonController<Alumno, AlumnoServices> {
	
	@PutMapping("/{id}")
	public ResponseEntity<?> modificarAlumno(@RequestBody Alumno alumno,@PathVariable Long id){
		Optional<Alumno> o = alumnoService.findById(id);
		
		if (o.isEmpty()) {
			return ResponseEntity.badRequest().body("No se encontro ningun usuario");
		}
		
		Alumno alumnoDb = o.get();
		alumnoDb.setNombre(alumno.getNombre());
		alumnoDb.setApellido(alumno.getApellido());
		alumnoDb.setEmail(alumno.getEmail());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(alumnoService.crearAlumno(alumnoDb));
	}
	
}
