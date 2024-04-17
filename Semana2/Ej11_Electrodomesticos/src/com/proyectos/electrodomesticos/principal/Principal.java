package com.proyectos.electrodomesticos.principal;

import com.proyectos.electrodomesticos.model.Electrodomestico;
import com.proyectos.electrodomesticos.model.Lavadora;
import com.proyectos.electrodomesticos.model.Television;

public class Principal {
	public static void main(String[] args) {
		final int NUM = 10;
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[NUM];
		
		electrodomesticos[0] = new Lavadora(20, 200, 100, "AZUL", 'F');
		electrodomesticos[1] = new Lavadora(100, 20);
		electrodomesticos[2] = new Lavadora(150, 40);
		electrodomesticos[3] = new Lavadora(120, 79);
		electrodomesticos[4] = new Lavadora(20, 10);

		electrodomesticos[5] = new Television(true, 20);
		electrodomesticos[6] = new Television(true, 40);
		electrodomesticos[7] = new Television(true, 80);
		electrodomesticos[8] = new Television(false, 100);
		electrodomesticos[9] = new Television(false, 15);

		double precioTotLavadoras = 0, precioTotTelevision = 0, precioTotElectrodomesticos = 0;
		
		/**
		 * Para cada electrodomestico, calculamos su precio final y añadimos el precio a una variable para saber cuanto
		 * precio cuesta el total de cada tipo de electrodomestico en total
		 */
		for (Electrodomestico electrodomestico : electrodomesticos) {
			double precioFinal = electrodomestico.precioFinal();

			precioTotElectrodomesticos += precioFinal;

			if (electrodomestico instanceof Lavadora) {
				precioTotLavadoras += precioFinal;

			} else if (electrodomestico instanceof Television) {
				precioTotTelevision += precioFinal;
			}
			
			
		}
		

		System.out.println("Precio de las lavadoras " + precioTotLavadoras);
		System.out.println("Precio de las televisiones " + precioTotTelevision);
		System.out.println("Precio de los electrodomesticos " + precioTotElectrodomesticos);

	}
}
