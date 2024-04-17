package com.proyectos.electrodomesticos.utils;

public enum Consumo {
	A (100),
	B (80),
	C (60),
	D (50),
	E (30),
	F (10);
	
	private double precio;
	
	Consumo(double precio){
		this.precio = precio;
	}
	
	public double getPrecio() {
		return this.precio;
	}

}
