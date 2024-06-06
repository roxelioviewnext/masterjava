package com.proyecto.microservicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jakarta.persistence.Entity;

@EnableJpaRepositories(basePackages = "com.proyecto.dao")
@EntityScan(basePackages = "com.proyecto.model")
@SpringBootApplication(scanBasePackages = {"com.proyecto.controller", "com.proyecto.service"})
public class HotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);
	}

}
