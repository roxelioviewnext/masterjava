package com.ejercicio.main;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

import com.ejercicio.liga.Clasificacion;
import com.ejercicio.liga.Equipo;
import com.ejercicio.liga.Jugador;
import com.ejercicio.liga.Partido;
import com.ejercicio.utils.Posicion;
/**
 * Clase main del proyecto
 * @author Roxelio Vello
 *
 */
public class Main {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Clasificacion liga = new Clasificacion("LA LIGA");
		agregarDatosEjemplo(liga);
		String equipo;
		
		System.out.println("----JUGADORES POR GOL-----");
		liga.mostrarJugadoresPorGol();
		System.out.println("----CLASIFICACION-----");
		liga.mostrarTablaClasificacion();
		System.out.println("----JORNADAS-----");
		liga.mostrarTablaJornadas();
		
		

	}

	/*
	 * Metodo para poner ejemplos de prueba
	 */
	private static void agregarDatosEjemplo(Clasificacion liga) {
		Jugador pepe = new Jugador("Pepe", 20, Posicion.PORTERO, 13, 1);
		Jugador lucas = new Jugador("Lucas", 24, Posicion.CENTRAL, 5, 9);
		Jugador jorge = new Jugador("Jorge", 20, Posicion.DELANTERO, 20, 15);
		Jugador raul = new Jugador("Raul", 20, Posicion.PORTERO, 13, 0);
		Jugador pablo = new Jugador("Pablo", 24, Posicion.CENTRAL, 5, 4);
		Jugador roi = new Jugador("Roi", 20, Posicion.DELANTERO, 20, 16);
		Jugador lune = new Jugador("Lune", 20, Posicion.PORTERO, 13, 0);
		Jugador xoel = new Jugador("Xoel", 24, Posicion.CENTRAL, 5, 5);
		Jugador martin = new Jugador("Martin", 20, Posicion.DELANTERO, 20, 19);

		Equipo mallorca = new Equipo("Mallorca", "Madrid ST");
		Equipo madrid = new Equipo("Madrid", "Madrid ST");
		Equipo celta = new Equipo("Celta", "Madrid ST");

		celta.ficharJugador(pepe);
		celta.ficharJugador(lucas);
		celta.ficharJugador(jorge);
		madrid.ficharJugador(raul);
		madrid.ficharJugador(pablo);
		madrid.ficharJugador(roi);
		mallorca.ficharJugador(xoel);
		mallorca.ficharJugador(lune);
		mallorca.ficharJugador(martin);

		liga.agregarEquipos(celta);
		liga.agregarEquipos(madrid);
		liga.agregarEquipos(mallorca);

		liga.agregarTodosPartidos();

	}

}
