package com.proyecto.model;

import com.proyecto.service.Imprimible;

public class Factura implements Imprimible {
	private int nFactura;
	private int codigoCliente;
	
	
	public Factura(int nFactura, int nLineas, int codigoCliente) {
		super();
		this.nFactura = nFactura;
		this.codigoCliente = codigoCliente;
	}
	@Override
	public void informeLargo() {
		System.out.println("Numero de factura: " + getnFactura() +"\tNumero codigo cliente: "+ getCodigoCliente());
		
	}
	@Override
	public void informeCorto() {
		System.out.println("Numero de factura: " + getnFactura());
	}
	
	public int getnFactura() {
		return nFactura;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}
	
	
	
}
