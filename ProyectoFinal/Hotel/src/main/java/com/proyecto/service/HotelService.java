package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.model.Hotel;

public interface HotelService {
	

	List<Hotel> getHoteles();

	List<Hotel> getHotelesDisponibles();

	Optional<Hotel> getHotel(String nombre);
	
}
