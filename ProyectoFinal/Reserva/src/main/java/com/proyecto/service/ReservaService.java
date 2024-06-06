package com.proyecto.service;

import java.util.List;

import com.proyecto.model.Reserva;

public interface ReservaService {

	List<Reserva> getReservas();

	void saveReserva(Reserva reserva);

	List<Reserva> getReserva(String nombreHotel);

	void deleteReserva(Reserva reserva);
	
	
		
}
