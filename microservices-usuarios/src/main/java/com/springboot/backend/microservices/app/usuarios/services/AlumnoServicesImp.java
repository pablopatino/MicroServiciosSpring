package com.springboot.backend.microservices.app.usuarios.services;


import org.springframework.stereotype.Service;

import com.springboot.backend.microservices.app.commonsalumnos.models.entity.Alumno;
import com.springboot.backend.microservices.app.usuarios.repository.AlumnoRepository;
import com.springboot.backend.microservices.commons.services.CommonServicesImp;

@Service
public class AlumnoServicesImp extends CommonServicesImp<Alumno, AlumnoRepository> implements AlumnoServices {

}
