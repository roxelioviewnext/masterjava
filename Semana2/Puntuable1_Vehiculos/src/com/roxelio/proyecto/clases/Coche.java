package com.roxelio.proyecto.clases;

import java.util.ArrayList;
import java.util.List;

public final class Coche extends Vehiculo {
	private static final int NUM_RUEDAS = 4;

	private boolean encendido; // variable para saber si el coche se ha arrancado;
	private List<Recorrido> recorridos;

	public Coche(String color, double peso) {
		super(color, peso);
		this.recorridos = new ArrayList<>();
	}

	/**
	 * Obtiene la distancia recorrida total del coche
	 * 
	 */
	public double obtenerDistanciaRecorrida() {
		double distancia = 0;

		distancia = recorridos.stream().map(Recorrido::getDistanciaRecorrida).mapToInt(Double::intValue).sum(); 	

		return distancia;
	}

	@Override
	public void arrancar() {
		if (!encendido) {
			encendido = true;
			System.out.println("El coche se ha encendido");
		} else {
			System.out.println("El coche ya esta encendido");
		}
	}

	@Override
	public void parar() {
		if (encendido) {
			encendido = false;
			System.out.println("El coche se ha parado");
		} else {
			System.out.println("El coche ya esta parado");
		}
	}

	@Override
	public void avanzar(double metros) {
		if (encendido) {
			Recorrido recorrido = new Recorrido(metros, velocidadMaxima);
			this.recorridos.add(recorrido);
			parar();
		} else {
			System.out.println("No puedes moverte porque el coche no esta encendido");
		}
	}

	@Override
	public void retroceder(double metros) {
		if (encendido) {
			Recorrido recorrido = new Recorrido(-metros, velocidadMaxima);
			this.recorridos.add(recorrido);
			parar();
		} else {
			System.out.println("No puedes retrodecer porque el coche no esta encendido");
		}

	}

	/**
	 * Calcula la velocidad maxima del coche dependiendo de su peso
	 */
	@Override
	protected double velocidadMaxima(double peso) {
		double velocidad = peso * 0.2;
		return velocidad;
	}

	@Override
	protected int getNumRuedas() {
		return NUM_RUEDAS;
	}

	public List<Recorrido> getDistanciaRecorrida() {
		return recorridos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [encendido=");
		builder.append(encendido);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append(", color=");
		builder.append(color);
		builder.append(", numeroRuedas=");
		builder.append(numeroRuedas);
		builder.append(", velocidadMaxima=");
		builder.append(velocidadMaxima);
		builder.append(", peso=");
		builder.append(peso);
		builder.append("]");
		return builder.toString();
	}

	

}
