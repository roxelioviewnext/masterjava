package com.cursojava.clases;

public class Persona {
	private String nombre;
	private int edad;
	private String direccion;

	public Persona() {
		super();
	}

	public Persona(String nombre, int edad, String direccion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
