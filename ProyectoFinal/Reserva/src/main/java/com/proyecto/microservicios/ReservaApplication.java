package com.proyecto.microservicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EnableJpaRepositories(basePackages = "com.proyecto.dao")
@EntityScan(basePackages = "com.proyecto.model")
@SpringBootApplication(scanBasePackages = {"com.proyecto.controller", "com.proyecto.service"})
public class ReservaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservaApplication.class, args);
	}
	
	@Bean
	RestTemplate template() {
		return new RestTemplate();
	}
}
