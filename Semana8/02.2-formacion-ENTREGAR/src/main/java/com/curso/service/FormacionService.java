package com.curso.service;

import java.util.List;

import com.curso.model.Formacion;

public interface FormacionService {
	
	List<Formacion> getFormaciones();
	
	List<Formacion> getFormacionesBetween(int max, int min);
	
	void saveFormacion(Formacion formacion);
}
