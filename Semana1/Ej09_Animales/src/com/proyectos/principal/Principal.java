package com.proyectos.principal;

import java.util.List;

import com.proyectos.animales.Animal;
import com.proyectos.animales.Aranha;
import com.proyectos.animales.Gatos;
import com.proyectos.animales.Mascota;
import com.proyectos.animales.Peces;

public class Principal {
	public static void main(String[] args) {
		Animal pez = new Peces("Pececillo");
		Animal gato = new Gatos("Gatete");
		Animal aranha = new Aranha();
		
		List<Animal> animales = List.of(pez, gato, aranha);
		
		
		for (Animal animal : animales) {
			if (animal instanceof Mascota) {
				((Mascota)animal).jugar();
			}
			animal.andar();
			animal.comer();
		}
	}
}
