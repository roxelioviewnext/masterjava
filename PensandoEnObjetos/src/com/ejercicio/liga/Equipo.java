package com.ejercicio.liga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Equipo implements Comparable<Equipo> {
	private String nombre;
	private String estadio;
	private int partidosGanados;
	private int partidosPerdidos;
	private int partidosEmpatados;
	private int puntos;
	private int golesTotales;
	private List<Jugador> jugadores;

	public Equipo(String nombre, String estadio) {
		super();
		this.nombre = nombre;
		this.estadio = estadio;
		this.partidosGanados = 0;
		this.partidosPerdidos = 0;
		this.partidosEmpatados = 0;
		this.puntos = 0;
		this.jugadores = new ArrayList<Jugador>();
	}

	public void actualizarGoles() {
		golesTotales = 0;
		for (Jugador jugador : jugadores) {
			golesTotales += jugador.getGolesEquipoActual();
		}
	}

	public void ficharJugador(Jugador jugador) {
		if (!jugadores.contains(jugador)) {
			jugadores.add(jugador);
		}
	}

	public void despedirJugador(Jugador jugador) {
		if (jugadores.contains(jugador)) {
			jugadores.remove(jugador);
		}
	}

	public int totalPartidosJugados() {

		return partidosEmpatados + partidosGanados + partidosPerdidos;
	}

	protected void actualizarPuntos() {
		this.puntos = partidosEmpatados + partidosGanados * 3;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}

	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}

	public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}

	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}

	public void setPartidosEmpatados(int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getGolesTotales() {
		return golesTotales;
	}

	public void setGolesTotales(int golesTotales) {
		this.golesTotales = golesTotales;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public int compareTo(Equipo p2) {

		if (this.getPuntos() > p2.getPuntos()) {
			return -1;

		} else if (this.getPuntos() == p2.getPuntos() && this.getPartidosGanados() > p2.getPartidosGanados()) {
			return -1;

		}

		return 1;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nombre + "\t").append("| " + totalPartidosJugados() + " | ")
				.append("| " + partidosGanados + " | ").append("| " + partidosEmpatados + " | ")
				.append("| " + partidosPerdidos + " | ").append("| " + golesTotales + " | ").append("| " + puntos + " | ");

		return builder.toString();
	}

}
