package com.proyecto.model;

/**
 * 
 * @author Roxelio Vello
 * @version 1.0
 *
 */
public class Tambor extends Instrumento{

	private String tamanho;
	
	public Tambor(String nombreInstrumento, String tipo, String tamanho) {
		super(nombreInstrumento, tipo);
		this.tamanho = tamanho;
	}
	
	public String aporrear() {
		return "Aporreando tambor " + nombreInstrumento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("\tTamaño: ");
		builder.append(tamanho);

		return builder.toString();
	}

	
	
	
}
