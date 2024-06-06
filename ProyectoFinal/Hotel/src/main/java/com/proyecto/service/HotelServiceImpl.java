package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dao.HotelDao;
import com.proyecto.model.Hotel;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelDao hotelDao;
	
	/**
	 * Este método se encarga de devolver todos los hoteles 
	 * @return La lista de todos los hoteles
	*/
	@Override
	public List<Hotel> getHoteles() {
		return hotelDao.findAll();
	}
	/**
	 * Este método se encarga de devolver todos los hoteles disponibles
	 * @return La lista de todos los hoteles disponibles
	*/
	@Override
	public List<Hotel> getHotelesDisponibles() {
		return hotelDao.findByDisponibleTrue();
	}
	
	/**
	 * Este método se encarga de devolver un hotel por su nombre
	 * @param nombre es una cadena de texto que contiene el nombre del hotel que se quiere buscar 
	 * @return El hotel con el nombre igual al parametro nombre
	*/
	@Override
	public Optional<Hotel> getHotel(String nombre) {
		return hotelDao.findByNombre(nombre);
	}

}
