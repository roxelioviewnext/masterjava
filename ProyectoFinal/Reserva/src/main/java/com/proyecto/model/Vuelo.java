package com.proyecto.model;

import java.time.LocalDate;

public class Vuelo {

	private Integer idVuelo;

	private String companhia;
	private LocalDate fechaVuelo;
	private Double precio;
	private Integer plazasDisponibles;

	public Vuelo() {

	}

	public Vuelo(Integer idVuelo, LocalDate fechaVuelo, Double precio, Integer plazasDisponibles) {
		super();
		this.idVuelo = idVuelo;
		this.fechaVuelo = fechaVuelo;
		this.precio = precio;
		this.plazasDisponibles = plazasDisponibles;
	}

	public Integer getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Integer idVuelo) {
		this.idVuelo = idVuelo;
	}

	public LocalDate getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDate fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getPlazasDisponibles() {
		return plazasDisponibles;
	}

	public void setPlazasDisponibles(Integer plazasDisponibles) {
		this.plazasDisponibles = plazasDisponibles;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

}
