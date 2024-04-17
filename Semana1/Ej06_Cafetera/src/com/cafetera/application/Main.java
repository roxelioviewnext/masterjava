package com.cafetera.application;


import com.cafetera.cafeteria.Cafetera;

public class Main {
	public static void main(String[] args) {
		//Cafetera cafetera = new Cafetera();
		//Cafetera cafetera = new Cafetera(100);
		Cafetera cafetera = new Cafetera(800, 100);
		System.out.println(cafetera.toString());
		
		cafetera.agregarCafe(200);
		System.out.println(cafetera.toString());
		
		cafetera.servirTaza(50);
		System.out.println(cafetera.toString());
		
		cafetera.llenarCafetera();
		System.out.println(cafetera.toString());
		
		cafetera.vaciarCafetera();
		System.out.println(cafetera.toString());
		
	}
}
