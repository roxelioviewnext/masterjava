package com.proyecto.interfaz;

public class Rectangulo implements Figura{
	private double base;
	private double altura;
	private double area;
		
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}


	@Override
	public void calcularArea() {
		setArea(base * altura);
		
	}
	
	@Override
	public double getArea() {
		return area;
	}
	
	@Override
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Figura: " + this.getClass().getSimpleName());
		builder.append("\t Area: ");
		builder.append(area);
		return builder.toString();
	}

}
