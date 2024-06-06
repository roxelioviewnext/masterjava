package com.curso.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.proyecto.model.Vuelo;

@Service
public class VueloServiceImpl implements VueloService {
	private static final String URL_VUELO = "http://localhost:7000/vuelos";
	
	@Autowired
	RestTemplate template;
	
	@Override
	public List<Vuelo> getVuelos(){
		return Stream.of(template.getForObject(URL_VUELO, Vuelo[].class)).toList();
	}
	
	@Override
	public Vuelo getVuelo(int id){
		return template.getForObject(URL_VUELO + "/vuelo/" + id, Vuelo.class);
	}
	
	@Override
	public List<Vuelo> getVueloDisponiblePorPlaza(int numPlazas){
		return Stream.of(template.getForObject(URL_VUELO + "/" + numPlazas, Vuelo[].class)).toList();
	}
	
	@Override
	public void updateVuelo(int idVuelo, int numPlazas) {
		template.put(URL_VUELO +"/"+ idVuelo +"/"+ numPlazas, null);
	}	
}
