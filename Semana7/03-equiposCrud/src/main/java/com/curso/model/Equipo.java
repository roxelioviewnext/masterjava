package com.curso.model;

import java.util.Collection;
import java.util.Objects;

public class Equipo implements Comparable<Equipo> {
	private int id;
	private String nombre;
	private int puntos;
	private String estadio;

	public Equipo() {
	}

	public Equipo(int id, String nombre, int puntos, String estadio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.puntos = puntos;
		this.estadio = estadio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", puntos=" + puntos + ", estadio=" + estadio + "]";
	}

	@Override
	public int compareTo(Equipo o) {
		if (o.getId() > id)
			return -1;

		if (o.getId() < id)
			return 1;

		return 0;
	}

}
