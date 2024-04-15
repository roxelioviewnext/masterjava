package com.proyecto.abstracta;

public class Circulo extends Figura{
	private double radio;
	
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public void calcularArea() {
		super.setArea(Math.PI * Math.pow(radio, 2));
	}
}
