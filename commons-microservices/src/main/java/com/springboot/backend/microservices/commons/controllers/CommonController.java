package com.springboot.backend.microservices.commons.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.springboot.backend.microservices.commons.services.CommonServices;


public class CommonController<E, S extends CommonServices<E>> {
	
	@Autowired
	protected S alumnoService;
	
	
	@GetMapping
	public ResponseEntity<?> listar(){
		return ResponseEntity.ok().body(alumnoService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id){
		Optional<E> o = alumnoService.findById(id);
		if (o.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontro ningun usuario");
		}
		return ResponseEntity.ok(o.get());
	}
	
	@PostMapping
	public ResponseEntity<?> crearAlumno(@RequestBody E entity){
		E entitydb = alumnoService.crearAlumno(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(entitydb);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		alumnoService.deleteById(id);
		
		return ResponseEntity.noContent().build();
		
	}
}
