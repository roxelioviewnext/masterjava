package com.proyecto.interfaz;

public class Cuadrado implements Figura{
	private double lado;
	private double area;
	
	
	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public void calcularArea() {
		setArea( lado * lado);
	}
	
	@Override
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public double getArea() {
		return area;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Figura: " + this.getClass().getSimpleName());
		builder.append("\t Area: ");
		builder.append(area);
		return builder.toString();
	}
	
}
