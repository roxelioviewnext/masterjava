package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Persona;

@Service
public class PersonaService {
	
	public static List<Persona> lista = new ArrayList<Persona>(
			List.of(
					new Persona("pepito", "grillo", 30),
					new Persona("juana", "de arco", 20),
					new Persona("maria", "rivas", 16)
					)
			);
	
	public List<Persona> buscaarTodos(){
		return lista;
	}
			
}
