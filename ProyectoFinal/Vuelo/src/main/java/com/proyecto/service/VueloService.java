package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.model.Vuelo;

public interface VueloService {
	
	List<Vuelo> getVuelos();
	
	List<Vuelo> getVuelosPorPlazasDisponibles(int numPlazas);
	
	void updateVuelo(int idVuelo, int numPlazas);

	Optional<Vuelo> getVuelo(int id);
}
