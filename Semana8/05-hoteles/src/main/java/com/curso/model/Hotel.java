package com.curso.model;

public class Hotel {

	private String nombre;
	private String localizacion;
	private Integer numHabitaciones;

	public Hotel() {
	}

	public Hotel(String nombre, String localizacion, Integer numHabitaciones) {
		super();
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.numHabitaciones = numHabitaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public Integer getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(Integer numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

}
