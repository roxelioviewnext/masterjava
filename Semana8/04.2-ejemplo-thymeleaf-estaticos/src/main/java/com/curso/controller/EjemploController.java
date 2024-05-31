package com.curso.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = {"index", "/"})
public class EjemploController {
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("nombre", "pepito");
		model.addAttribute("frutas", List.of("platano", "cerezas", "manzanas", "naranjas", "peras"));
		
		return "index";
	}
	
	@GetMapping("/welcome") // welcome?name=pepito
	public String welcome(Model model,
			@RequestParam(name = "name", required = false, defaultValue = "Desconocido") String name) {
		model.addAttribute("name", name);
		return "welcome";
	}
	
}
