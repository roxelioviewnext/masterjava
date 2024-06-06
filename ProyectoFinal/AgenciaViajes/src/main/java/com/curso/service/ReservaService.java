package com.curso.service;

import java.util.List;

import com.proyecto.model.Reserva;

public interface ReservaService {

	List<Reserva> getReservas();

	List<Reserva> getReserva(String nombre);

	void saveReserva(Reserva reserva);


}
