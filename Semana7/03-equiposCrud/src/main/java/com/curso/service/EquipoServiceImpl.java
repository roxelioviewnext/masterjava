package com.curso.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Equipo;

@Service
public class EquipoServiceImpl implements EquipoService{
	List<Equipo> equipos;
	
	public EquipoServiceImpl() {
		equipos = new ArrayList<Equipo>(
				List.of(
				new Equipo(1, "Madrid", 45, "Bernabeu"),
				new Equipo(2, "Barcelona", 50, "Camp nou"),
				new Equipo(3, "AAA", 10, "AAA"),
				new Equipo(4, "BBB", 10, "BBB"),
				new Equipo(5, "CCC", 10, "CCC")
				));
	}

	@Override
	public Equipo findOne(int id) {
		return equipos.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
	}

	@Override
	public List<Equipo> findAll() {
		return equipos.stream().sorted().toList();
	}
	
	@Override
	public Equipo primerPuesto() {
		return equipos.stream().max(Comparator.comparing(Equipo::getPuntos)).orElse(null);
	}

	@Override
	public void saveEquipo(Equipo equipo) {
		if(findOne(equipo.getId()) == null) {
			equipos.add(equipo);
		}
		
	}

	@Override
	public void updateEquipo(Equipo equipo) {
		equipos.stream().filter(e -> e.getId() == equipo.getId()).forEach(e->{
			e.setNombre(equipo.getNombre());
			e.setEstadio(equipo.getEstadio());
			e.setPuntos(equipo.getPuntos());
		});
	}

	@Override
	public void deleteEquipo(Equipo equipo) {
		if(findOne(equipo.getId()) != null) {
			equipos.remove(equipo);
		}
		
	}

	
	
}
