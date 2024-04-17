package com.proyectos.electrodomesticos.utils;

public enum Tamanho {
	PEQUENHO (0, 19, 10),
	MEDIANO (20, 49, 50),
	GRANDE (50, 79, 80),
	MUY_GRANDE (80, 9999, 100);
	
	private final int minRange; //minimo tamaño para ese tipo de consumo
	private int maxRange; // maximo tamaño para ese tipo de consumo
	private final int precio; //precio asociado a este tipo de consumo
	
	Tamanho(int minRange, int precio){
		this.minRange = minRange;
		this.precio = precio;
	}
	
	Tamanho(int minRange, int maxRange, int precio){
		this.minRange = minRange;
		this.maxRange = maxRange;
		this.precio = precio;
	}
	
	public int getMinRange() {
		return minRange;
	}
	
	public int getMaxRange() {
		return maxRange;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	/**
	 * Comprueba si el valor introducido esta dentro de un rango de un tipo de Tamanho,
	 * si está, devuelve ese Tamanho, sino devuelve null
	 * @param valor
	 */
	public static Tamanho onRange(double valor) {
		Tamanho[] tamanho = values () ;
		for (Tamanho tamanho2 : tamanho) {
			int min = tamanho2.getMinRange();
			int max = tamanho2.getMaxRange();
			
			if(valor >= min && valor <= max ) {
				return tamanho2;
			}
		}
		return null;
	}
}
