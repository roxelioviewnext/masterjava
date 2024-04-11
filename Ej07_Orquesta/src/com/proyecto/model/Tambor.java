package com.proyecto.model;

public class Tambor extends Instrumento{

	private String tamaño;
	
	public Tambor(String nombreInstrumento, String tipo, String tamaño) {
		super(nombreInstrumento, tipo);
		this.tamaño = tamaño;
	}
	
	public String aporrear() {
		return "Aporreando tambor " + nombreInstrumento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("\tTamaño: ");
		builder.append(tamaño);

		return builder.toString();
	}

	
	
	
}
