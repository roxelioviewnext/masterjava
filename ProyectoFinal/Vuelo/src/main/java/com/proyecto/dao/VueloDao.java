package com.proyecto.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.model.Vuelo;

public interface VueloDao extends JpaRepository<Vuelo, Integer>{

	@Query("SELECT v FROM Vuelo v WHERE v.plazasDisponibles >= :numPlazas")
	List<Vuelo> getVuelosPorPlazasDisponibles(int numPlazas);

}
