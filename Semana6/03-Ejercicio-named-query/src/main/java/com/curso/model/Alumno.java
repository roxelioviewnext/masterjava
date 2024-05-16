package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "alumno")
@NamedQueries({
	@NamedQuery(name = "buscarTodos", query = "SELECT p FROM Alumno p"),
	@NamedQuery(name = "buscarPorId", query = "SELECT p FROM Alumno p WHERE id = :id"),
	@NamedQuery(name = "buscarPorNombre", query = "SELECT p FROM Alumno p WHERE nombre LIKE :nombre"),
	@NamedQuery(name = "buscarPorApellido", query = "SELECT p FROM Alumno p WHERE apellido LIKE :apellido")
})
public class Alumno {

	@Id
	private int id;

	private String nombre;
	private String apellido;
	private String curso;

	public Alumno() {
		super();
	}

	public Alumno(int id, String nombre, String apellido, String curso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.curso = curso;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getCurso() {
		return curso;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Alumno [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellido=");
		builder.append(apellido);
		builder.append(", curso=");
		builder.append(curso);
		builder.append("]");
		return builder.toString();
	}

}
