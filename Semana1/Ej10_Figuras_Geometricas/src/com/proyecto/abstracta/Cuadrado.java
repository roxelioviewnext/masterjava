package com.proyecto.abstracta;

public class Cuadrado extends Figura{
	private double lado;
	
	
	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public void calcularArea() {
		super.setArea( lado * lado);
		
	}
	
}
