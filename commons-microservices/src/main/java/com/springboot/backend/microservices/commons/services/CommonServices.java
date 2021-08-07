package com.springboot.backend.microservices.commons.services;

import java.util.Optional;


public interface CommonServices<E> {
	
	public Iterable<E> findAll();
	
	public Optional<E> findById(Long id);
	
	public E crearAlumno(E entity);
	
	public void deleteById(Long id);
	
}
