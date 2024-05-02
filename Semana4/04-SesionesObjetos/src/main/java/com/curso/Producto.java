package com.curso;

public class Producto {
	private int id;
	private String concepto;
	private double precio;
	
	public Producto(int id, String concepto, double precio) {
		super();
		this.id = id;
		this.concepto = concepto;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public String getConcepto() {
		return concepto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
