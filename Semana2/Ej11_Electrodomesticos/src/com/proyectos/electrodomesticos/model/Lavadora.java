package com.proyectos.electrodomesticos.model;

public class Lavadora extends Electrodomestico{
	private static final double CARGA_DEFAULT= 5D;
	private double carga = CARGA_DEFAULT;
	
	public Lavadora() {
	}
	
	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}

	public Lavadora(double carga, double precio, double peso, String color, char consumoElectrico) {
		super(precio, peso, color, consumoElectrico);
		this.carga = carga;
	}
	
	@Override
	public double precioFinal() {
		super.precioFinal();
		if (carga > 30d) {
			super.precioBase += 50d ;
		}
		
		return super.precioBase;
	}
	

	public double getCarga() {
		return carga;
	}
	
}
