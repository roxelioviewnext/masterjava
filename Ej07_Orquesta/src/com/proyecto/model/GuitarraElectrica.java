package com.proyecto.model;

public class GuitarraElectrica extends Guitarra {
	private double potencia;
	
	@Override
	public String tocar() {
		return "Tocando la guitarra eléctrica";
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	
}
