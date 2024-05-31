package com.curso.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.curso.model.Hotel;

@Service
public class HotelService {
	
	public static List<Hotel> lista = new ArrayList<Hotel>(
			List.of(
				new Hotel("paraiso", "Barcelona", 36),
				new Hotel("infierno", "Barcelona", 92),
				new Hotel("rosas moradas", "Barcelona", 8),
				new Hotel("vitiza", "Barcelona", 120),
				new Hotel("resero", "Barcelona", 100)
				));
	
	public Hotel obtenerHotel(String nombre) {
		
		return lista.stream().filter(h-> h.getNombre().equalsIgnoreCase(nombre)).findFirst().orElse(null);
	}
	
	public List<Hotel> obtenerHoteles(){
		return lista;
	}
}
