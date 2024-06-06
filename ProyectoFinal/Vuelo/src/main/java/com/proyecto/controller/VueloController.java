package com.proyecto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.model.Vuelo;
import com.proyecto.service.VueloService;

@RestController
@RequestMapping("/vuelos")
public class VueloController {

	@Autowired
	private VueloService vueloService;
	
	/**
	 * Este método se encarga mostrar todos los vuelos
	 * @return La lista de todos los vuelos
	*/
	@GetMapping(value = "")
	public List<Vuelo> getVuelos() {
		return vueloService.getVuelos();
	}
	
	/**
	 * Este método se encarga mostrar un vuelo
	 * @param id es un entero sacado de la url el cual contiene en id del vuelo
	 * @return El vuelo con el id pasado por el PathVariable
	*/
	@GetMapping(value = "/vuelo/{id}")
	public Optional<Vuelo> getVuelo(@PathVariable int id) {
		return vueloService.getVuelo(id);
	}

	/**
	 * Este método se encarga mostrar todos los vuelos mas de un numero de plazas pasado por parametro
	 * @param numPlazas es un entero que contiene el numero de plazas minimas deseadas para los vuelos
	 * @return La lista de todos los vuelos que tengan las mismas o mas plazas disponibles que numPlazas
	*/
	@GetMapping(value = "/{numPlazas}")
	public List<Vuelo> getVuelosPorPlazasDisponibles(@PathVariable int numPlazas) {
		return vueloService.getVuelosPorPlazasDisponibles(numPlazas);
	}
	
	/**
	 * Este método se encarga de actualizar las plazas de un vuelo a traves del id del vuelo
	 * @return void
	*/
	@PutMapping(value = "/{idVuelo}/{numPlazas}")
	public void actualizaVuelo(@PathVariable int idVuelo,@PathVariable int numPlazas) {
		vueloService.updateVuelo(idVuelo, numPlazas);
	}
}
