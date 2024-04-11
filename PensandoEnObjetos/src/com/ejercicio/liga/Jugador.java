package com.ejercicio.liga;

import com.ejercicio.utils.Posicion;

public class Jugador implements Comparable<Jugador>{
	private String nombre;
	private int edad;
	private Posicion posicion;
	private int dorsal;
	private int golesEquipoActual;
	private int golesTotalesCarrera;
	
	public Jugador(String nombre, int edad, Posicion posicion, int dorsal) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		this.dorsal = dorsal;
	}
	public Jugador(String nombre, int edad, Posicion posicion, int dorsal, int goles) {
		new Jugador(nombre, edad, posicion, dorsal);
		this.golesEquipoActual = goles;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public int getNumero() {
		return dorsal;
	}

	public void setNumero(int numero) {
		this.dorsal = numero;
	}
	
	public int getGolesEquipoActual() {
		return golesEquipoActual;
	}
	public void setGolesEquipoActual(int golesEquipoActual) {
		this.golesEquipoActual = golesEquipoActual;
	}
	public int getGolesTotalesCarrera() {
		return golesTotalesCarrera;
	}
	public void setGolesTotalesCarrera(int golesTotalesCarrera) {
		this.golesTotalesCarrera = golesTotalesCarrera;
	}
	
	/*
	 * Método compareTo para comparar jugadores de mayores 
	 * a menores goleadores en su equipo actual 
	 */
	@Override
	public int compareTo(Jugador o) {
		if (this.golesEquipoActual > o.getGolesEquipoActual()) {
			return -1;
		} else if (this.golesEquipoActual == o .getGolesEquipoActual()) {
			return 0;
		} else return 1;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jugador: ").append(nombre)
		.append(", edad ").append(edad)
		.append(", posicion ").append(posicion)
		.append(", numero ").append(dorsal)
		.append(", goles ").append(golesEquipoActual);
		return builder.toString();
	}
	
	
	
	
}
