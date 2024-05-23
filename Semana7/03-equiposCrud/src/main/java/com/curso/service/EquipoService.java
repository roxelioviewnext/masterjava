package com.curso.service;

import java.util.List;

import com.curso.model.Equipo;

public interface EquipoService {
	
	public Equipo findOne(int id);
	
	public List<Equipo> findAll();
	
	public Equipo primerPuesto();
	
	public void saveEquipo(Equipo equipo);
	
	public void updateEquipo(Equipo equipo);
	
	public void deleteEquipo(Equipo equipo);
	
}
