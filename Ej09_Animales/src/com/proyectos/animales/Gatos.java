package com.proyectos.animales;

public class Gatos extends Mascota{
	private static int numeroPatas = 4;
	
	public Gatos(String nombre) {
		super(numeroPatas, nombre);
	}

	@Override
	public void comer() {
		System.out.println("A los gatos les gusta comer peces y arañas");
		
	}

	@Override
	public void jugar() {
		System.out.println("A "+ nombre +" le gusta jugar con pelotas");
		
	}
	
	
}	
