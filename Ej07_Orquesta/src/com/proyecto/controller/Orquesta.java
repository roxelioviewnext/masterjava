package com.proyecto.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.proyecto.model.Instrumento;
import com.proyecto.model.Tambor;

/**
 * 
 * @author Roxelio Vello
 * @version 1.0
 *
 */
public class Orquesta {
	private final static Logger LOGGER = Logger.getLogger("MyLog");
	
	/** 
	 * Variables para cambiar el color del texto imprimido por pantalla
	 */
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
				System.out.print(ANSI_WHITE);
				LOGGER.info(((Tambor)instrumento).aporrear());
			}else {
				System.out.print(ANSI_WHITE);
				LOGGER.info(instrumento.tocar());
			}
		}
	}

	public void agregarIntrumento(Instrumento instrumento) {
		if (!instrumentos.contains(instrumento) ) {
			instrumentos.add(instrumento);
			System.out.print(ANSI_GREEN);
			LOGGER.info("Se ha añadido la "+ instrumento.getNombreInstrumento()+" {}\n" + instrumento.toString());
		}else {
			System.out.print(ANSI_RED);
			LOGGER.info("No se ha podido añadir la "+ instrumento.getNombreInstrumento()+" {}\n" + instrumento.toString());
		}
	}
}
