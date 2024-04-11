package com.proyecto.model;

abstract class Instrumento{
	protected String nombreInstrumento;
	protected String tipo;
	
	public String tocar() {
		return "Tocando el instrumento" + nombreInstrumento;

	}
	
	public String afinar() {
		return "Afinando el instrumento" + nombreInstrumento;
	}
	
	public String aporrear() {
		return "Aporreando tambor" + nombreInstrumento;
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
	
		
	
}
