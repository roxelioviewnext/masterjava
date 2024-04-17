package com.roxelio.proyecto.clases;

public enum Color {
	UNDEFINED ("No definido"),
	ROJO ("Rojo"),
	VERDE ("Verde"),
	AMARILLO ("Amarillo"),
	AZUL ("Azul"),
	ROSA ("Rosa");
	
	private String nombre;
	
	Color(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
