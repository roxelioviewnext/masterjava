package com.proyecto.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.proyecto.dao.ReservaDao;
import com.proyecto.model.Hotel;
import com.proyecto.model.Reserva;
import com.proyecto.model.Vuelo;

import jakarta.transaction.Transactional;

@Service
public class ReservaServiceImpl implements ReservaService {
	
	private static final String URL_VUELO = "http://localhost:7000/vuelos";
	private static final String URL_HOTEL = "http://localhost:8000/hoteles";

	@Autowired
	private ReservaDao reservaDao;

	@Autowired
	private RestTemplate template;

	/**
	 * Este método se encarga de devolver todas las reservas 
	 * @return La lista de todas las reservas
	*/
	@Override
	public List<Reserva> getReservas() {
		return reservaDao.findAll();
	}
	
	/**
	 * Este método se encarga de crear una reserva nueva si las plazas del vuelo son iguales o mayores a las que se piden en la reserva
	 * @param reserva es una reserva la cual se quiere crear
	 * @return void
	*/
	@Override
	@Transactional
	public void saveReserva(Reserva reserva) {

		Vuelo vuelo = Stream.of(template.getForObject(URL_VUELO + "/" + reserva.getIdVuelo(), Vuelo[].class))
				.findFirst().orElse(null);

		if (vuelo.getIdVuelo() == reserva.getIdVuelo()) {
			if (vuelo.getPlazasDisponibles() >= reserva.getTotPersonas()) {

				template.put(URL_VUELO + "/" + reserva.getIdVuelo() + "/" + reserva.getTotPersonas(), null);

				reservaDao.save(reserva);
			}
		}

	}
	
	/**
	 * Este método se encarga de devolver las reservas de un hotel, el cual le pasamos el nombre del hotel por parametro
	 * @param nombreHotel es una cadena de texto que contiene el nombre de un hotel existente
	 * @return La lista de reservas de ese mismo hotel
	*/
	@Override
	public List<Reserva> getReserva(String nombreHotel) {

		Hotel hotel = template.getForObject(URL_HOTEL + "/" + nombreHotel, Hotel.class);
		
		return reservaDao.findAll().stream().filter(r -> r.getIdHotel() == hotel.getIdHotel()).toList();
		
	}
	
	/**
	 * Este método se encarga de eliminar una reserva
	 * @param reserva es una reserva la cual se quiere eliminar
	 * @return void
	*/
	@Override
	@Transactional
	public void deleteReserva(Reserva reserva) {
		 reservaDao.delete(reserva);
	}

}
