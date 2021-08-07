package com.springboot.backend.microservices.commons.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public class CommonServicesImp<E, R extends CrudRepository<E, Long>> implements CommonServices<E> {
	
	@Autowired
	private R repository;

	@Override
	@Transactional
	public E crearAlumno(E entity) {
		return repository.save(entity);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<E> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<E> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}
}