package com.tienda.application;

import com.tienda.almacen.Ordenador;
import com.tienda.almacen.Telefono;

public class Main {
	public static void main(String[] args) {
		//Instanciamos los objetos
		Ordenador ordenador = new Ordenador("Lenovo", 800.00, 32, "Intel i5-14600k", 16, 500);
		Telefono telefono = new Telefono("Iphone 8", 999.99, 6, "Amazon");
		
		//Los mostramos por pantalla con el metodo toString()
		System.out.println(ordenador);
		System.out.println(telefono);
	}
}
