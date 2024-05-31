package com.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.service.HotelService;

@Controller
@RequestMapping("/")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@GetMapping
	public String show(Model model) {
		model.addAttribute("hoteles", hotelService.obtenerHoteles());
		return "formulario";
	}
	
	@GetMapping("reservar/{nombre}")
	public String reservar(@PathVariable("nombre") String nombre, Model model) {
		model.addAttribute("hotel", hotelService.obtenerHotel(nombre));
		
		return "reservar";
	}
}
