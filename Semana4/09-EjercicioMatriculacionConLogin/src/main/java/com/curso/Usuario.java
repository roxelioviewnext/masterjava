package com.curso;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private static int aumento = 1;
	private int id;
	private String nombre;
	private List<String> matriculas;
	
	public Usuario() {
		this.id = aumento;
		this.matriculas = new ArrayList<>();
		aumento++;
	}
	
	public Usuario(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public void agregarMatricula(String matricula) {
		if (!matriculas.contains(matricula)) {
			matriculas.add(matricula);
		}
		
	}

	public void eliminarMatricula(String matricula) {
		if (matriculas.contains(matricula)) {
			matriculas.remove(matricula);
		}
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public List<String> getMatriculas() {
		return matriculas;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMatriculas(List<String> matriculas) {
		this.matriculas = matriculas;
	}

}
