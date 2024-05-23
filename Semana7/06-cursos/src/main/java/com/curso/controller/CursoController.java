package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Curso;
import com.curso.service.CursoService;

@RestController
public class CursoController {

	@Autowired
	private CursoService cursoService;

	@PostMapping(value = "cursos", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> saveCurso(@RequestBody Curso curso) {
		return cursoService.saveCurso(curso);
	}
	@DeleteMapping(value = "cursos", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> deleteCurso(@RequestBody Curso curso) {
		return cursoService.deleteCurso(curso);
	}
	
	@PutMapping(value ="cursos")
	public void updateDuracionCurso(@RequestParam("cod") int codigo, @RequestParam("dur") int duration) {
		cursoService.updateDuracionCurso(codigo, duration);
	}
	
	@GetMapping(value = "cursos/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Curso findCurso(@PathVariable int codigo) {
		return cursoService.findCurso(codigo);
	}
	
	@GetMapping(value = "cursos/{min}/{max}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> findCursosByPrecio(@PathVariable double min, @PathVariable double max) {
		return cursoService.findCursosByPrecio(min, max);
	}
}
