package com.proyectos.animales;

public abstract class Mascota extends Animal{
	protected String nombre;
	public Mascota(int numeroPatas, String nombre) {
		super(numeroPatas);
		this.nombre = nombre;
	}
	
	public abstract void jugar();
}
