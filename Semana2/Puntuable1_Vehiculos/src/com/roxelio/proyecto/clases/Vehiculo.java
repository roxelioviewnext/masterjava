package com.roxelio.proyecto.clases;

import java.util.Random;

public abstract class Vehiculo implements Conducible{
	
	protected final String matricula;
	protected Color color;
	protected final int numeroRuedas;
	protected double velocidadMaxima;
	protected double peso;
	
	
	public Vehiculo(String color, double peso) {
		super();
		this.matricula = generarMatricula();
		this.color = pintarVehiculo(color);
		this.peso = peso;
		this.velocidadMaxima = velocidadMaxima(peso);
		this.numeroRuedas = getNumRuedas();
	}
	
	protected abstract double velocidadMaxima(double peso2);

	protected abstract int getNumRuedas();
	
	/*
	 * Le cambia el color al coche, si el color no esta en la clase enum Color, el color pasa a undefined
	 * @param String color
	 * @return Color colorFinal
	 */
	public Color pintarVehiculo(String color) {
		Color colorFinal = Color.UNDEFINED;
		
		for (Color colores : Color.values()) {
			if (color.equalsIgnoreCase(colores.getNombre())) {
				colorFinal = colores;
			}
		}
		return colorFinal;
	}

	/**
	 * Genera un string aleatorios con 4 caracteres en mayuscula y 3 numeros  
	 * 
	 */
	private String generarMatricula() {
		Random r = new Random();
		String matricula = "";
		for (int i = 0; i < 7 ; i++){
			int num = (int)(r.nextDouble() * 10);
			char l = (char)(r.nextInt(26) + 'a');
			if (i >3) {
				matricula += String.valueOf(num);
			}else matricula += String.valueOf(l).toUpperCase();
		}
		return matricula;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehiculo [matricula=");
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
