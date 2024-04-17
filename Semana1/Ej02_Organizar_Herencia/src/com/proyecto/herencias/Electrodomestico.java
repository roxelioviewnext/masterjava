package com.proyecto.herencias;

public abstract class Electrodomestico {
	private double precio;
	private double velocidad;
	private double voltaje;
	
	public void encender() {
		
	}
	
	public void apagar() {
		
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(double voltaje) {
		this.voltaje = voltaje;
	}
	
	
}
