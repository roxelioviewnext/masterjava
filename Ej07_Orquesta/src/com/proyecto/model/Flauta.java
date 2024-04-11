package com.proyecto.model;

public class Flauta extends Instrumento{
	private String modelo;

	@Override
	public String afinar() {
		return super.afinar() + "Soplando";
	}
	
}
