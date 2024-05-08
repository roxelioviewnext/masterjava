package com.entrega.model;

public class Producto {
	private static int cont = 1;
	private int id;
	private String nombre;
	private Seccion seccion;
	private double precio;
	private int stock;

	public Producto(Seccion seccion, String nombre, double precio, int stock) {
		super();
		this.id = cont;
		this.seccion = seccion;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		cont++;
	}
	
	public Producto(int id, Seccion seccion, String nombre, double precio, int stock) {
		super();
		this.id = id;
		this.seccion = seccion;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public String getSeccionString() {
		return seccion.name().toLowerCase();
	}
	
	public Seccion getSeccion() {
		return seccion;
	}

	public void setSeccion(Seccion seccion) {
		this.seccion = seccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
		
	}
	public int getId() {
		return id;
	}
	
	/*
	 * Si los nombres de los productos son iguales, los productos son iguales
	 */
	@Override
	public boolean equals(Object obj) {
		return this.id == ((Producto)obj).getId();
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", seccion=" + seccion + ", precio=" + precio + ", stock="
				+ stock + "]";
	}
	
	

}
