package com.proyecto.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.model.Hotel;

public interface HotelDao extends JpaRepository<Hotel, Integer>{

	Optional<Hotel> findByNombre(String nombre);

	List<Hotel> findByDisponibleTrue();

}
