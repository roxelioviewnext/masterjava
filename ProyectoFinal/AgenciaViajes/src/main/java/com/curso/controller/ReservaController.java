package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.service.HotelService;
import com.curso.service.ReservaService;
import com.curso.service.VueloService;
import com.proyecto.model.Reserva;

@Controller
@RequestMapping("/reservas")
public class ReservaController {
	
	@Autowired
	private ReservaService reservaService;
	
	@Autowired
	private VueloService vueloService;
	
	@Autowired
	private HotelService hotelService;
	
	@GetMapping("")
	public String getReservas(Model model) {
		model.addAttribute("reservas", reservaService.getReservas());
		return "reservas/mostrar";
	}
	
	@GetMapping("/{nombre}")
	public String getReserva(@PathVariable String nombre, Model model) {
		model.addAttribute("reservas", List.of(reservaService.getReserva(nombre)));
		return "reservas/mostrar";
	}
	
	@GetMapping("/form")
	public String formReserva(@ModelAttribute Reserva reserva, Model model) {
		model.addAttribute("hotelesDisponibles", hotelService.getDisponibles());
		model.addAttribute("vuelosDisponibles", vueloService.getVueloDisponiblePorPlaza(1));
		return "reservas/form";
	}
	
	@PostMapping("/reservar")
	public String saveReserva(@ModelAttribute Reserva reserva) {
		reservaService.saveReserva(reserva);
		return "redirect:/reservas";
	}
}
