package com.curso.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Info;


@RestController
public class SaludoController {
	
	@GetMapping(value = "saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludar() {
		return "Hola desde Spring";
	}
	
	@GetMapping(value = "saludo/{a}/{b}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludar(@PathVariable("a") String a, @PathVariable("b") String b) {
		return "Hola desde Spring " + a + " " + b;
	}
	
	@GetMapping(value = "saludo2", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludar2(@RequestParam("a") String a, @RequestParam("b") String b) {
		return "Hola desde Spring " + a + " " + b;
	}
	
	@GetMapping(value = "saludoEdad/{a}/{b}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludarEdad(@PathVariable("a") String a, @PathVariable("b") Integer b) {
		return "Hola " + a + " tu edad es: " + b;
	}
	
	@GetMapping(value = "infoCliente", produces = MediaType.APPLICATION_JSON_VALUE)
	public Info infoCliente() {
		return new Info("Jaimito", 40, "jaime@gmail.com");
	}
	
}
