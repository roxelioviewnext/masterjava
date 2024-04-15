package com.proyectos.animales;

public class Peces extends Mascota{
	private static int numeroPatas = 8;
	
	public Peces(String nombre) {
		super(numeroPatas, nombre);
	}

	@Override
	public void comer() {
		System.out.println("Los peces comen plancton");
	}

	@Override
	public void andar() {
		super.andar();
		System.out.println("En realidad no ando, nado");
	}

	@Override
	public void jugar() {
		System.out.println("Estoy nadando");
		
	}
	
	
	
	

}
