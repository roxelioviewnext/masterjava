package com.proyectos.animales;

public class Aranha extends Animal{
	private static int numeroPatas = 8;
	
	public Aranha() {
		super(numeroPatas);

	}

	@Override
	public void comer() {
		System.out.println("Las arañas comen mosquitos");
	}


}
