package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Ejemplar;
import com.curso.service.EjemplaresService;

@RestController
public class EjemplaresController {

	@Autowired
	private EjemplaresService ejemplaresService;

	@PostMapping(value = "ejemplar/{isbn}/{titulo}/{tematica}")
	public List<Ejemplar> nuevoEjemplar(@PathVariable int isbn, @PathVariable String titulo,
			@PathVariable String tematica) {

		Ejemplar ejemplar = new Ejemplar(isbn, titulo, tematica);
		return ejemplaresService.nuevoEjemplar(ejemplar);
	}

}
