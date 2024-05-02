package com.proyectos.electrodomesticos.model;

import com.proyectos.electrodomesticos.utils.Color;
import com.proyectos.electrodomesticos.utils.Consumo;
import com.proyectos.electrodomesticos.utils.Tamanho;

public class Electrodomestico {
	private static final double PRECIO_BASE_DEFAULT = 100d;
	private static final Color COLOR_DEFAULT = Color.BLANCO;
	private static final Consumo CONSUMO_DEFAULT = Consumo.F;
	private static final double PESO_DEFAULT = 5d;
	private static final Tamanho TAMANHO = Tamanho.GRANDE;
	
	protected double precioBase = PRECIO_BASE_DEFAULT;
	protected Color color = COLOR_DEFAULT;
	protected Consumo consumoElectrico = CONSUMO_DEFAULT;
	protected double peso = PESO_DEFAULT;
	protected Tamanho tamanho = Tamanho.onRange(peso);
	
	public Electrodomestico() {
	}

	public Electrodomestico(double precio, double peso) {
		this.precioBase = precio;
		this.peso = peso;
	}

	public Electrodomestico(double precio, double peso, Color color, Consumo consumoElectrico) {
		this.precioBase = precio;
		this.peso = peso;
		this.color = color;
		this.consumoElectrico = consumoElectrico;
		this.tamanho = Tamanho.onRange(peso);
	}

	/**
	 * Varia el precio segun el consumo energetico y el tamaño del electrodomestico
	 */
	public double precioFinal() {
		
		return precioBase += consumoElectrico.getPrecio() + tamanho.getPrecio();
	}

	public double getPeso() {
		return peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public Color getColor() {
		return color;
	}

	public Consumo getConsumoElectrico() {
		return consumoElectrico;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precioBase + ", color=" + color + ", consumoElectrico=" + consumoElectrico
				+ ", peso=" + peso + "]";
	}

}
