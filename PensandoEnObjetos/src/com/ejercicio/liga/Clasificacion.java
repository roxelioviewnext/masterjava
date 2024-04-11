package com.ejercicio.liga;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Clasificacion {
	private String nombre;
	
	private List<Equipo> equipos;

	private List<Jugador> jugadores;
	
	private List<Partido> jornadas;
	
	public Clasificacion(String nombre) {
		super();
		this.nombre = nombre;
		this.equipos =  new ArrayList<>();;
		this.jornadas =  new ArrayList<>();
		this.jugadores = new ArrayList<>();
	}
	
	public void actualizarDatos() {
		
	}
	public void agregarPartido(Partido partido) {
		if(!jornadas.contains(partido)) {
			jornadas.add(partido);	
		}else {
			System.out.println("Este partido ya está registrado");
		}
	}
	
	public void agregarTodosPartidos() {
		List<Equipo> equiposRef = equipos;
		for (int i = 0; i < equiposRef.size() ; i++) {
			for (Equipo equipo : equiposRef) {
				if(equipo.getNombre() == equiposRef.get(i).getNombre()) {
					break;
				}
				Partido nuevaJornada = new Partido(equiposRef.get(i), equipo, LocalDate.of(i, i, i));
				jornadas.add(nuevaJornada);
			}
		}
	}
	
	
	public void agregarEquipos(Equipo equipo) {
		if(!equipos.contains(equipo)) {
			equipos.add(equipo);	
		}else System.out.println("Este equipo ya esta refistrado");
		
	}
	/*
	 * Metodo que muestra el nombre de todos los equipos registrados
	 */
	public void mostrarNombreEquipos() {
		for (Equipo equipo : equipos) {
			System.out.print(equipo.getNombre() + "  ");
		}
	}
	/*
	 * Muestra por consola todos los jugadores ordenados por gol de mayor a menor
	 */
	public void mostrarJugadoresPorGol(){
		jugadores = actualizarJugadores();
		List<Jugador> jugadoresOrdenados = jugadores;
		jugadoresOrdenados.sort((j1,j2) -> j1.compareTo(j2));
		for (Jugador jugador : jugadoresOrdenados) {
			String nombreEquipo = "FA";
			nombreEquipo = buscarEquipoJugador(jugador).getNombre();
			System.out.println(jugador +" Equipo: " + nombreEquipo);
			}
	}
	
	/*
	 * Muestra por consola todos los jugadores de un equipo ordenados por gol de mayor a menor
	 */
	public void mostrarJugadoresPorGol(String nombreEquipo){
		jugadores = actualizarJugadores();
		List<Jugador> jugadoresOrdenados = new ArrayList<>();
		for (Equipo equipo : equipos) {
			if ( nombreEquipo.equalsIgnoreCase(equipo.getNombre()) ){
				jugadoresOrdenados = equipo.getJugadores();
			}
		}
		jugadoresOrdenados.sort( (j1,j2) -> j1.compareTo(j2));
		for (Jugador jugador : jugadoresOrdenados) {
			System.out.println(jugador);
		}
	}
	
	/*
	 * Muestra por consola todas las jornadas
	 */
	public void mostrarTablaJornadas() {
		for (Partido jornada : jornadasOrdenados()) {
			System.out.println(jornada.toString());
		}
	}
	
	/*
	 * Muestra por consola la tabla de clasificacion de la liga
	 */
	public void mostrarTablaClasificacion() {
		for (Equipo equipo : equipos) {
			equipo.actualizarGoles();
		}
		System.out.println("\t" + "  PJ    PG    PE    PP    GF    PT ");
		for (Equipo equipo : equiposOrdenados()) {
			System.out.println(equipo.toString());
		}
		
	}
	/*
	 * Devuelve una lista de los todos jugadores de la liga 
	 */
	private List<Jugador> actualizarJugadores() {
		List<Jugador> players = new ArrayList<>();
		for (Equipo equipo : equipos) {
			players.addAll(equipo.getJugadores());
		}
		return players;
	}
	
	/*
	 * Devuelve el equipo del jugador
	 * Si el jugador no tiene equipo devuelve null
	 */
	private Equipo buscarEquipoJugador(Jugador jugador) {
		for (Equipo equipo: equipos) {
			if(equipo.getJugadores().contains(jugador)) {
				return equipo;	
			}
		}
		return null;
	}

	/*
	 * Devuelve una lista de los partidos ordenados por fecha
	 */
	private List<Partido> jornadasOrdenados(){
		List<Partido> ret = jornadas;
		ret.sort((p1,p2) -> p1.compareTo(p2));
		return ret;
	}
	
	/*
	 * Devuelve una lista de los equipos ordenados por puntos y partidos ganados.
	 */
	private List<Equipo> equiposOrdenados(){
		List<Equipo> ret = equipos;
		ret.sort((p1,p2) -> p1.compareTo(p2));
		return ret;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
