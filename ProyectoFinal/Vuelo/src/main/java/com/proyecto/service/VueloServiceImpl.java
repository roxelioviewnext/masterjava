package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dao.VueloDao;
import com.proyecto.model.Vuelo;

import jakarta.transaction.Transactional;

@Service
public class VueloServiceImpl implements VueloService {
	
	@Autowired
	private VueloDao vueloDao;
	
	/**
	 * Este método se encarga de devolver todos los vuelos que tengan igual o mas plazas que el parametro numPlazas
	 * @param numPlazas es un entero que contiene el numero de plazas minimas deseadas para el vuelo 
	 * @return La lista de todos los vuelos que tengan como minimo de plazas disponibles el numPlazas
	*/
	@Override
	public List<Vuelo> getVuelosPorPlazasDisponibles(int numPlazas) {
		return vueloDao.getVuelosPorPlazasDisponibles(numPlazas) ;
	}
	
	/**
	 * Este método se encarga de devolver todos los vuelos 
	 * @return La lista de todos los vuelos
	*/
	@Override
	public List<Vuelo> getVuelos() {
		return vueloDao.findAll();
	}
	/**
	 * Este método se encarga restar plazas a un vuelo si las plazas que se quieren restar no son mayores a las plazas que tiene el vuelo
	 * @param numPlazas es un entero que contiene el numero de plazas que se quieren quitar al vuelo
	 * @param idVuelo es un entero que contiene el id del vuelo
	 * @return void
	*/
	@Override
	@Transactional
	public void updateVuelo(int idVuelo, int numPlazas) {
		vueloDao.findAll().stream().filter(v -> v.getIdVuelo() == idVuelo).findFirst().ifPresent(v->{
			if(v.getPlazasDisponibles() >= numPlazas) {
				v.setPlazasDisponibles(v.getPlazasDisponibles() - numPlazas);	
			}
		});
	}
	/**
	 * Este método se encarga de devolver un vuelo por su id
	 * @param id es un entero que contiene el id del vuelo 
	 * @return El vuelo con ese id
	*/
	@Override
	public Optional<Vuelo> getVuelo(int id) {
		return vueloDao.findById(id);
	}

}
