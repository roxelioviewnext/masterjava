package com.curso.controller;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.curso.service.VueloService;
import com.proyecto.model.Vuelo;

@Controller
public class VueloController {
	
	private static final String URL_VUELO = "http://localhost:7000/vuelos";
	
	@Autowired
	private VueloService vueloService;
	
	@Autowired
	RestTemplate template;
	
	@GetMapping("/vuelos")
	public String getVuelos(Model model) {
		List<Vuelo> respuesta = Stream.of(template.getForObject(URL_VUELO, Vuelo[].class)).toList();
		model.addAttribute("vuelos", respuesta);
		model.addAttribute("mostrar", true);
		return "vuelos/mostrar";
	}
	
	@GetMapping("/vuelos/{id}")
	public String getVuelo(@PathVariable int id, Model model) {
		model.addAttribute("vuelos", List.of(vueloService.getVuelo(id)));
		model.addAttribute("verVuelo", true);
		return "vuelos/mostrar";
	}
	
	
	@GetMapping(value = "/guardar/{idVuelo}/{numPlazas}")
	public String guardarPut(@PathVariable int idVuelo, @PathVariable int numPlazas) {
		vueloService.updateVuelo(idVuelo, numPlazas);
		return "redirect:/vuelos";
	}
}
