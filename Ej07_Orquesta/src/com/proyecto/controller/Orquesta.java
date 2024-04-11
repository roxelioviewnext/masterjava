package com.proyecto.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.proyecto.model.Flauta;

import com.proyecto.model.Instrumento;
import com.proyecto.model.Tambor;

public class Orquesta {
	private final static Logger LOGGER = Logger.getLogger("MyLog");
	public static final String ANSI_WHITE = "\u001B[37m";
	
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RED = "\u001B[31m";
	
	private List<Instrumento> instrumentos;
	
	public Orquesta() {
		instrumentos = new ArrayList<Instrumento>();
	}
	
	
	public void tocar() {
		for (Instrumento instrumento : instrumentos) {
			if(instrumento instanceof Tambor) {
				LOGGER.info(ANSI_WHITE + ((Tambor)instrumento).aporrear());
			}else LOGGER.info(ANSI_WHITE + instrumento.tocar());
		}
	}

	public void añadirIntrumento(Instrumento instrumento) {
		if (!instrumentos.contains(instrumento) ) {
			instrumentos.add(instrumento);
			System.out.println(ANSI_GREEN);
			LOGGER.info("Se ha añadido la "+ instrumento.getNombreInstrumento()+" {}\n" + instrumento.toString());
		}else {
			System.out.println(ANSI_RED);
			LOGGER.info("No se ha podido añadir la "+ instrumento.getNombreInstrumento()+" {}\n" + instrumento.toString());
		}
	}
}
