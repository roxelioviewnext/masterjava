package com.proyectos.electrodomesticos.model;

import com.proyectos.electrodomesticos.utils.Color;
import com.proyectos.electrodomesticos.utils.Consumo;

public class Television extends Electrodomestico{
	private boolean sintonizarTdt;
	private double resolucion;
	
	public Television() {
	}

	public Television(boolean sintonizarTdt, double resolucion) {
		this.sintonizarTdt = sintonizarTdt;
		this.resolucion = resolucion;
	}

	public Television(boolean sintonizarTdt, double resolucion,double precio, double peso,
			Color color, Consumo consumoElectrico) {
		super(precio, peso, color, consumoElectrico);
		this.sintonizarTdt = sintonizarTdt;
		this.resolucion = resolucion;
	}

	@Override
	public double precioFinal() {
		super.precioFinal();
		
		if(resolucion > 40) {
			super.precioBase *= 1.3;
		}
		if(sintonizarTdt) {
			super.precioBase += 50;
		}
		return super.precioBase;
	}

	
	
	
	
	
	
}
