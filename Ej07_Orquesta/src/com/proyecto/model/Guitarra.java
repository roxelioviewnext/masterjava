package com.proyecto.model;

public abstract class Guitarra extends Instrumento {
	

	protected int numeroCuerdas;
	
	public Guitarra(String nombreInstrumento, String tipo, int numeroCuerdaas) {
		super(nombreInstrumento, tipo);
		this.numeroCuerdas = numeroCuerdaas;
	}
	@Override
	public String afinar() {
		return super.afinar();
	}
	
	@Override
	public String tocar() {
		return super.tocar();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("\tGuitarra Numero de cuerdas: ");
		builder.append(numeroCuerdas);
		return builder.toString();
	}
	
	
}
