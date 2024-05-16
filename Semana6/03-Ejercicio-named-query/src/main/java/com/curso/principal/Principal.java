package com.curso.principal;

import com.curso.basedatos.Consulta;
import com.curso.model.Alumno;

public class Principal {
	
	public static void main(String[] args) {
		Consulta consulta = new Consulta();
		
		
		//BUSCAR POR TODOS
		System.out.println("TODOS");
		for (Alumno alumno: consulta.buscarTodos()) {
			System.out.println(alumno);
		} 
		
		//BUSCAR POR ID
		System.out.println("POR ID");
		for (Alumno alumno: consulta.buscarPorId(1)) {
			System.out.println(alumno);
		} 
		
		//BUSCAR POR NOMBRE
		System.out.println("POR NOMBRE");
		for (Alumno alumno: consulta.buscarPorNombre("Martin")) {
			System.out.println(alumno);
		} 
		
		//BUSCAR POR APELLIDO
		System.out.println("POR APELLIDO");
		for (Alumno alumno: consulta.buscarPorApellido("Solano")) {
			System.out.println(alumno);
		} 
	}
}
