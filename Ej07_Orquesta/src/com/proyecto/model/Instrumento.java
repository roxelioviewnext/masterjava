package com.proyecto.model;

/**
 * 
 * @author Roxelio Vello
 * @version 1.0
 *
 */
public abstract class Instrumento{
	protected String nombreInstrumento;
	protected String tipo;
	
	public Instrumento(String nombreInstrumento, String tipo) {
		this.nombreInstrumento = nombreInstrumento;
		this.tipo = tipo;
	}
	
	public String tocar() {
		return "Tocando el instrumento " + nombreInstrumento;

	}
	
	public String afinar() {
		return "Afinando el instrumento " + nombreInstrumento;
	}
	
	
	public String getNombreInstrumento() {
		return nombreInstrumento;
	}

	public void setNombreInstrumento(String nombreInstrumento) {
		this.nombreInstrumento = nombreInstrumento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Instrumento : " + this.getClass().getSimpleName());
		
		builder.append("\tNombre: ");
		builder.append(nombreInstrumento);
		builder.append("\tTipo: ");
		builder.append(tipo);
		return builder.toString();
	}
	
	
	
}
