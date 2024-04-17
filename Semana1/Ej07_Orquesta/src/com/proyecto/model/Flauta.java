package com.proyecto.model;

/**
 * 
 * @author Roxelio Vello
 * @version 1.0
 *
 */
public class Flauta extends Instrumento{
	private String modelo;
	
	public Flauta(String nombreInstrumento, String tipo, String modelo) {
		super(nombreInstrumento, tipo);
		this.modelo = modelo;
	}
	
	@Override
	public String afinar() {
		return super.afinar() + " Soplando";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("\tModelo: ");
		builder.append(modelo);
		return builder.toString();
	}
	
	
}
