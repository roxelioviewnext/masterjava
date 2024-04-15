package com.proyectos.animales;

public abstract class Animal {
	protected int numeroPatas;
	
	
	
	public Animal(int numeroPatas) {
		super();
		this.numeroPatas = numeroPatas;
	}

	public void andar() {
		System.out.println("Este animal anda sobre "+ numeroPatas + " patas");
	};
	
	public abstract void comer();

}
