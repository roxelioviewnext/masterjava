package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.service.HotelService;

@Controller
@RequestMapping("/hoteles")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@GetMapping("")
	public String hoteles(Model model) {
		model.addAttribute("hoteles", hotelService.getHoteles());
		return "hoteles/mostrar";
	};

	@GetMapping("/{nombre}")
	public String hotel(@PathVariable String nombre, Model model) {
		model.addAttribute("hoteles", List.of(hotelService.getHotel(nombre)));
		model.addAttribute("verHotel", true);
		return "hoteles/mostrar";
	};

	@GetMapping("/disponibles")
	public String hotelesDisponibles(Model model) {
		model.addAttribute("hoteles", hotelService.getDisponibles());
		model.addAttribute("checked", true);
		return "hoteles/mostrar";
	};
}
