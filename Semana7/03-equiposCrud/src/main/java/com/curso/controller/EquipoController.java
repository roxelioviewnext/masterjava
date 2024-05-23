package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Equipo;
import com.curso.service.EquipoService;

@RestController
public class EquipoController {
	
	
	@Autowired
	private EquipoService equipoService;
	
	@GetMapping(value = "equipo/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Equipo findOne(@PathVariable int id) {
		return equipoService.findOne(id);
	}
	
	@GetMapping(value = "equipo", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Equipo> finAll(){
		return equipoService.findAll();
	}
	
	@GetMapping(value = "equipoGanador", produces = MediaType.APPLICATION_JSON_VALUE)
	public Equipo primerPuesto() {
		return equipoService.primerPuesto();
	}
	
	@PostMapping(value= "equipo", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveEquipo(@RequestBody Equipo equipo) {
		 equipoService.saveEquipo(equipo);
	}
	
	@PutMapping(value= "equipo", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateEquipo(@RequestBody Equipo equipo) {
		 equipoService.updateEquipo(equipo);
	}
	@DeleteMapping(value= "equipo", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deleteEquipo(@RequestBody Equipo equipo) {
		 equipoService.deleteEquipo(equipo);
	}
	
}
