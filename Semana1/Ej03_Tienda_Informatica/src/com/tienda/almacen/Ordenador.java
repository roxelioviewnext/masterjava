package com.tienda.almacen;

public class Ordenador extends Producto {
	private String procesador;
	private int cantidadMemoria;
	private int capacidadDisco;
	
	
	
	public Ordenador(String modelo, double precio, int cantidadAlmacen, String procesador, int cantidadMemoria,
			int capacidadDisco) {
		super(modelo, precio, cantidadAlmacen);
		this.procesador = procesador;
		this.cantidadMemoria = cantidadMemoria;
		this.capacidadDisco = capacidadDisco;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public int getCantidadMemoria() {
		return cantidadMemoria;
	}
	public void setCantidadMemoria(int cantidadMemoria) {
		this.cantidadMemoria = cantidadMemoria;
	}
	public int getCapacidadDisco() {
		return capacidadDisco;
	}
	public void setCapacidadDisco(int capacidadDisco) {
		this.capacidadDisco = capacidadDisco;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("| Procesador: ");
		builder.append(procesador);
		builder.append("| Cantidad de memoria: ");
		builder.append(cantidadMemoria);
		builder.append("| Capacidad de disco: ");
		builder.append(capacidadDisco);
		return builder.toString();
	}
	
	
	
}
