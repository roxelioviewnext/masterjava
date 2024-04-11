package com.proyecto.model;

import com.proyecto.service.Imprimible;

public class Pagina implements Imprimible{
	private int nPaginas;
	private int nLineas;
	
	
	public Pagina(int nPaginas, int nLineas) {
		super();
		this.nPaginas = nPaginas;
		this.nLineas = nLineas;
	}

	@Override
	public void informeLargo() {
		System.out.println("Numero de paginas: " + getnPaginas() + "\tNumero de lineas: "+ getnLineas());
	}

	@Override
	public void informeCorto() {
		System.out.println("Numero de paginas: " +getnPaginas());
	}

	public int getnPaginas() {
		return nPaginas;
	}

	public int getnLineas() {
		return nLineas;
	}

	
	
}
