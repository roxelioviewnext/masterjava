package com.empresa.clases;

import java.time.LocalDate;

public class Empleado {
	private int id;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private Double salario;

	public Empleado(int id, String nombre, String apellido, LocalDate fechaNacimiento, Double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.salario = salario;
	}

	public Empleado(String nombre, String apellido, LocalDate fechaNacimiento, Double salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.salario = salario;
	}

	public Empleado() {
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public Double getSalario() {
		return salario;
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

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellido=");
		builder.append(apellido);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", salario=");
		builder.append(salario);
		builder.append("]");
		return builder.toString();
	}

}
