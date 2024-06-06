package com.curso.service;

import java.util.List;

import com.proyecto.model.Vuelo;

public interface VueloService {

	List<Vuelo> getVuelos();

	Vuelo getVuelo(int id);

	List<Vuelo> getVueloDisponiblePorPlaza(int numPlazas);

	void updateVuelo(int idVuelo, int numPlazas);

}
