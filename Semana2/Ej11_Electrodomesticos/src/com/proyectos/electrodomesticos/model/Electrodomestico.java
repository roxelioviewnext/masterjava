package com.proyectos.electrodomesticos.model;

import com.proyectos.electrodomesticos.utils.Color;
import com.proyectos.electrodomesticos.utils.Consumo;
import com.proyectos.electrodomesticos.utils.Tamanho;

public class Electrodomestico {
	private static final double PRECIO_BASE_DEFAULT = 100d;
	private static final Color COLOR_DEFAULT = Color.BLANCO;
	private static final Consumo CONSUMO_DEFAULT = Consumo.F;
	private static final double PESO_DEFAULT = 5d;

	protected double precioBase = PRECIO_BASE_DEFAULT;
	protected Color color = COLOR_DEFAULT;
	protected Consumo consumoElectrico = CONSUMO_DEFAULT;
	protected double peso = PESO_DEFAULT;

	public Electrodomestico() {
	}

	public Electrodomestico(double precio, double peso) {
		this.precioBase = precio;
		this.peso = peso;
	}

	public Electrodomestico(double precio, double peso, String color, char consumoElectrico) {
		this.precioBase = precio;
		this.peso = peso;
		this.color = comprobarColor(color);
		this.consumoElectrico = comprobarConsumoEnergetico(consumoElectrico);
	}

	/**
	 * Comprueba una letra si es de tipo Consumo, si la letra es de tipo consumo
	 * devuelve ese consumo, sino devuelve Consumo.F
	 * 
	 * @param char letra
	 */
	private Consumo comprobarConsumoEnergetico(char letra) {
		Consumo[] consumo = Consumo.values();
		Consumo ret = Consumo.F;

		for (int i = 0; i < consumo.length; i++) {
			if (String.valueOf(letra).equalsIgnoreCase(consumo[i].toString())) {
				ret = consumo[i];
			}
		}

		return ret;
	}

	/**
	 * Compruba si el string color es de tipo Color, si es de tipo Color devuelve
	 * ese tipo, sino de devuelve Color.BLANCO
	 * 
	 * @param String color
	 */
	private Color comprobarColor(String color) {
		Color[] comprobarColor = Color.values();
		Color ret = Color.BLANCO;

		for (int i = 0; i < comprobarColor.length; i++) {
			if (color.equalsIgnoreCase(comprobarColor[i].name())) {
				ret = comprobarColor[i];
			}
		}
		return ret;
	}

	/**
	 * Varia el precio segun el consumo energetico y el tamaño del electrodomestico
	 */
	public double precioFinal() {
		precioBase += consumoElectrico.getPrecio();

		Tamanho tamanho = Tamanho.onRange(peso);
		precioBase += tamanho.getPrecio();


		return precioBase;
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
