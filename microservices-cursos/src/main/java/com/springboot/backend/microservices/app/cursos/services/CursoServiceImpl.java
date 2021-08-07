package com.springboot.backend.microservices.app.cursos.services;

import org.springframework.stereotype.Service;

import com.springboot.backend.microservices.app.cursos.models.entity.Curso;
import com.springboot.backend.microservices.app.cursos.repository.CursoRepository;
import com.springboot.backend.microservices.commons.services.CommonServicesImp;

@Service
public class CursoServiceImpl extends CommonServicesImp<Curso,CursoRepository> implements CursoService {

}
