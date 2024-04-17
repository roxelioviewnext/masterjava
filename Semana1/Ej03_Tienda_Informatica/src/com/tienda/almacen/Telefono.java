package com.tienda.almacen;

public class Telefono extends Producto{
	private String operador;
	
	public Telefono(String modelo, double precio, int cantidadAlmacen, String operador) {
		super(modelo, precio, cantidadAlmacen);
		this.operador = operador;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("| Operador: ");
		builder.append(operador);
		return builder.toString();
	}
	
	
}
