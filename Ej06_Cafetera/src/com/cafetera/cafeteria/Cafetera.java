package com.cafetera.cafeteria;

public class Cafetera {
	private int capacidadMaxima;
	private int capacidadActual;

	public Cafetera() {
		this.capacidadMaxima = 1000;
		this.capacidadActual = 0;
	}

	public Cafetera(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadActual = this.capacidadMaxima;
	}

	public Cafetera(int capacidadMaxima, int capacidaActual) {
		if (capacidaActual > capacidadMaxima) {
			this.capacidadActual = capacidadMaxima;
		}else { this.capacidadActual = capacidaActual;}
		this.capacidadMaxima = capacidadMaxima;
	}
	
	public void llenarCafetera() {
		setCapacidadActual(getCapacidadMaxima());
	}
	
	public void servirTaza(int capacidadTaza){
		if(capacidadTaza > this.capacidadActual) {
			this.capacidadActual = 0;
		}else this.capacidadActual -= capacidadTaza;
	}
	
	public void vaciarCafetera() {
		this.capacidadActual = 0;
	}
	
	public void agregarCafe(int agregarCapacidad) {
		if( (agregarCapacidad + this.capacidadActual) > this.capacidadMaxima) {
			this.capacidadActual = getCapacidadMaxima();
		}else this.capacidadActual += agregarCapacidad;
	}
	
	public int getCapacidadActual() {
		return capacidadActual;
	}

	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CapacidadMaxima= ");
		builder.append(capacidadMaxima);
		builder.append(", CapacidadActual= ");
		builder.append(capacidadActual);
		return builder.toString();
	}
	
	
}
