package com.proyecto.abstracta;

public class Rectangulo extends Figura{
	private double base;
	private double altura;
	
		
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}


	@Override
	public void calcularArea() {
		super.setArea(base * altura);
		
	}
	
	
}
