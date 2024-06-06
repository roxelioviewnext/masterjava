package com.curso.service;

import java.util.List;

import com.proyecto.model.Hotel;

public interface HotelService {

	List<Hotel> getHoteles();

	List<Hotel> getDisponibles();

	Hotel getHotel(String nombre);

}
