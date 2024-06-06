package com.curso.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.proyecto.model.Reserva;

@Service
public class ReservaServiceImpl implements ReservaService {

	private static final String URL_RESERVA= "http://localhost:9000/reserva";
	
	
	@Autowired
	RestTemplate template;
	
	@Override
	public List<Reserva> getReservas(){
		return Stream.of(template.getForObject(URL_RESERVA, Reserva[].class)).toList();
	}
	
	@Override
	public List<Reserva> getReserva(String nombre) {
		return Stream.of(template.getForObject(URL_RESERVA+ "/" + nombre, Reserva[].class)).toList();
	}
	
	@Override
	public void saveReserva(Reserva reserva) {
		template.postForLocation(URL_RESERVA, reserva);
	}


}
