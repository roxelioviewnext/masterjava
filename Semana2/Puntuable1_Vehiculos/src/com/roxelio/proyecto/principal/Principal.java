package com.roxelio.proyecto.principal;


import java.util.ArrayList;
import java.util.List;

import com.roxelio.proyecto.clases.Coche;
import com.roxelio.proyecto.clases.Vehiculo;
import com.roxelio.proyecto.clases.Recorrido;

public class Principal {
	public static void main(String[] args) {
		List<Vehiculo> vehiculos = new ArrayList<>();
		Vehiculo coche = new Coche("Amarillo", 1000);
		
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo);
		}
		
		vehiculos.add(coche);
		
		coche.arrancar();
		coche.avanzar(12004);
		coche.arrancar();
		coche.retroceder(1000);
		coche.parar();
		
		
		
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo);
			if(vehiculo instanceof Coche) {
				
				for (Recorrido vehiculo2 : ((Coche)vehiculo).getDistanciaRecorrida()) {
					System.out.println(vehiculo2.toString());
				}
			}
		}
		
	}
}
