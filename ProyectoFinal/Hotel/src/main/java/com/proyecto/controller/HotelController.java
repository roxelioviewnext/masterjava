package com.proyecto.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.model.Hotel;
import com.proyecto.service.HotelService;

@RestController
@RequestMapping("/hoteles")
public class HotelController {
	@Autowired
	private HotelService hotelService;
	
	/**
	 * Este método se encarga mostrar todos los hoteles
	 * @return La lista de todos los hoteles
	*/
	@GetMapping(value ="", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> getHoteles(){
		return hotelService.getHoteles();
	};
	/**
	 * Este método se encarga mostrar todos los hoteles disponibles
	 * @return La lista de todos los hoteles disponibles
	*/
	@GetMapping(value ="/disponibles", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> getHotelesDisponibles(){
		return hotelService.getHotelesDisponibles();
	};
	
	/**
	 * Este método se encarga mostrar todos los hoteles
	 * @return El hotel con ese nombre
	*/
	@GetMapping(value ="/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Hotel> getHotel(@PathVariable String nombre){
		return hotelService.getHotel(nombre);
	};
}
