package com.proyecto.interfaz;

import java.util.List;


public class Principal {
	public static void main(String[] args) {
		Figura cuadrado = new Cuadrado(5.2);
		Figura circulo = new Circulo(10);
		Figura rectangulo = new Rectangulo(2,5);
		
		List<Figura> figuras = List.of(cuadrado, circulo, rectangulo);
		
		for (Figura figura : figuras) {
			figura.calcularArea();
			System.out.println(figura);
		}
	}
}
