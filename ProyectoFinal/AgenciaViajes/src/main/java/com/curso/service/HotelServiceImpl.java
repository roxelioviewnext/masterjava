package com.curso.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.proyecto.model.Hotel;

@Service
public class HotelServiceImpl implements HotelService {

	private static final String URL_HOTEL = "http://localhost:8000/hoteles";

	@Autowired
	RestTemplate template;
	
	@Override
	public List<Hotel> getHoteles(){
		return Stream.of(template.getForObject(URL_HOTEL, Hotel[].class)).toList();
	}
	
	@Override
	public List<Hotel> getDisponibles(){
		return Stream.of(template.getForObject(URL_HOTEL + "/disponibles", Hotel[].class)).toList();
	}
	
	@Override
	public Hotel getHotel(String nombre){
		return template.getForObject(URL_HOTEL + "/" + nombre, Hotel.class);
	}
	
}
