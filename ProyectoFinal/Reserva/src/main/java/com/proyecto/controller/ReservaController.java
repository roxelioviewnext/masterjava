package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.model.Reserva;
import com.proyecto.service.ReservaService;

@RestController
public class ReservaController {
	
	@Autowired
	private ReservaService reservaService;
	
	/**
	 * Este método se encarga mostrar todas las reservas
	 * @return La lista de todas las reservas
	*/
	@GetMapping(value = "reserva", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> getReservas(){
		return reservaService.getReservas();
	}
	
	/**
	 * Este método se encarga de crear una reserva nueva
	 * @return void
	*/
	@PostMapping(value = "reserva", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveReserva (@RequestBody Reserva reserva) {
		reservaService.saveReserva(reserva);
	}
	
	/**
	 * Este método se encarga mostrar todas las reservas de un hotel en especifico
	 * @param nombreHotel es el nombre de un hotel existente
	 * @return La lista de todas las reservas de ese hotel
	*/
	@GetMapping(value = "reserva/{nombreHotel}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> getReserva(@PathVariable String nombreHotel){
		return reservaService.getReserva(nombreHotel);
	}
	
	
	/**
	 * Este método se encarga de eliminar una reserva existente
	 * @return void
	*/
	@DeleteMapping(value = "reserva", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deleteReserva (@RequestBody Reserva reserva) {
		reservaService.deleteReserva(reserva);
	}
	
}
