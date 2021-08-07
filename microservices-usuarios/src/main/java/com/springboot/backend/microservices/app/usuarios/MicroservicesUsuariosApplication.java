package com.springboot.backend.microservices.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.springboot.backend.microservices.app.commonsalumnos.models.entity"})
public class MicroservicesUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesUsuariosApplication.class, args);
	}

}
