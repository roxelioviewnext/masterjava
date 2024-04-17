package com.proyecto.interfaz;

public class Circulo implements Figura{
	private double radio;
	private double area;
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public void calcularArea() {
		setArea(Math.PI * Math.pow(radio, 2));
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
