package com.curso.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="peliculas")
public class Pelicula {
	@Id
	private int id;
	private String codigo;
	private String titulo;
	private String director;
	@Column(name = "precio_alquiler")
	private Double precioAlquiler;
	
	public Pelicula() {
		super();
	}

	public Pelicula(int id, String codigo, String titulo, String director, Double precioAlquiler) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.titulo = titulo;
		this.director = director;
		this.precioAlquiler = precioAlquiler;
	}

	public int getId() {
		return id;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDirector() {
		return director;
	}

	public Double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setPrecioAlquiler(Double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pelicula [id=");
		builder.append(id);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", director=");
		builder.append(director);
		builder.append(", precioAlquiler=");
		builder.append(precioAlquiler);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
