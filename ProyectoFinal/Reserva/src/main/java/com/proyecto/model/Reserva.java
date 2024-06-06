package com.proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idReserva;

	private String nombreCliente;
	private String dni;
	private Integer idVuelo;
	private Integer idHotel;
	private Integer totPersonas;

	public Reserva() {

	}
	
	
	public Reserva(String nombreCliente, String dni, Integer idVuelo, Integer idHotel, Integer totPersonas) {
		super();
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.idVuelo = idVuelo;
		this.idHotel = idHotel;
		this.totPersonas = totPersonas;
	}

	public Reserva(Integer idReserva, String nombreCliente, String dni, Integer idVuelo, Integer idHotel,
			Integer totPersonas) {
		super();
		this.idReserva = idReserva;
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.idVuelo = idVuelo;
		this.idHotel = idHotel;
		this.totPersonas = totPersonas;
	}

	public Integer getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Integer getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Integer idVuelo) {
		this.idVuelo = idVuelo;
	}

	public Integer getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Integer idHotel) {
		this.idHotel = idHotel;
	}

	public Integer getTotPersonas() {
		return totPersonas;
	}

	public void setTotPersonas(Integer totPersonas) {
		this.totPersonas = totPersonas;
	}

}
