package com.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.service.PersonaService;

@Controller
@RequestMapping("/")
public class PersonaController {
	
	@Autowired

	private PersonaService personaService;
	
	@GetMapping("lista")
	public String lista() {
		return "personas/lista";
	}
	
	@GetMapping("lista2")
	public String lista2(Model model) {
		model.addAttribute("personas", personaService.buscaarTodos());
		return "personas/lista2";
	}
	

}
