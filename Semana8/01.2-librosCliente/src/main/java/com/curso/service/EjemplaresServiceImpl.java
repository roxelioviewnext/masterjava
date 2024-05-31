package com.curso.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.model.Ejemplar;

@Service
public class EjemplaresServiceImpl implements EjemplaresService {
	
	private static final String URL = "http://localhost:8080/libros";
	
	@Autowired
	RestTemplate template;

	@Override
	public List<Ejemplar> nuevoEjemplar(Ejemplar ejemplar) {
		template.postForLocation(URL , ejemplar);
		
		return Stream.of(template.getForObject(URL, Ejemplar[].class)).toList();
	}

}
