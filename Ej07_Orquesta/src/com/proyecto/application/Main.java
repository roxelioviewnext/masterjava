package com.proyecto.application;

import com.proyecto.controller.Orquesta;
import com.proyecto.model.Flauta;
import com.proyecto.model.GuitarraElectrica;
import com.proyecto.model.Instrumento;
import com.proyecto.model.Tambor;

public class Main {
	public static void main(String[] args) {
		 Orquesta orquesta = new Orquesta();
		 
		 Instrumento flauta = new Flauta("flauta", "travesera", "f");
		 Instrumento tambor = new Tambor("tambor", "caja", "pequeño");
		 Instrumento guitarraElectrica = new GuitarraElectrica("guitarra", "electrica", 8, 1000);
		 
		 orquesta.añadirIntrumento(flauta);
		 orquesta.añadirIntrumento(tambor);
		 orquesta.añadirIntrumento(guitarraElectrica);
		 
		 orquesta.tocar();
		 
	}
}
