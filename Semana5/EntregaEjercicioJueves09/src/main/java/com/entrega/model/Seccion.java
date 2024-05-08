package com.entrega.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Seccion {
	INFORMATICA,
	LIMPIEZA,
	JARDINERIA,
	CARPINTERIA;
	
	
	public static List<Seccion> secciones = new ArrayList<Seccion>(Arrays.asList(Seccion.values()));
	
	
}
