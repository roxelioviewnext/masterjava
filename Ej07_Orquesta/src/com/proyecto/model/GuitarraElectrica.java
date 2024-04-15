package com.proyecto.model;

/**
 * 
 * @author Roxelio Vello
 * @version 1.0
 *
 */
public class GuitarraElectrica extends Guitarra {
	
	private double potencia;
	
	public GuitarraElectrica(String nombreInstrumento, String tipo, int numeroCuerdaas, double potencia) {
		super(nombreInstrumento, tipo, numeroCuerdaas);
		this.potencia = potencia;
	}
	
	@Override
	public String tocar() {
		return "Tocando la guitarra eléctrica";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("\tPotencia: ");
		builder.append(potencia);
		return builder.toString();
	}

	
	
	
}
