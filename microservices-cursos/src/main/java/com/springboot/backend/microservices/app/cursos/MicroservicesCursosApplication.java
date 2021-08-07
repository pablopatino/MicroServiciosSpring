package com.springboot.backend.microservices.app.cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.springboot.backend.microservices.app.commonsalumnos.models.entity",
			 "com.springboot.backend.microservices.app.cursos.models.entity"})
public class MicroservicesCursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesCursosApplication.class, args);
	}

}
