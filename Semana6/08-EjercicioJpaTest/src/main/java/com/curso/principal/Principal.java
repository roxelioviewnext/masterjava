package com.curso.principal;

import com.curso.consulta.Consulta;

import jakarta.persistence.Persistence;

public class Principal {
	public static void main(String[] args) {
		Persistence.generateSchema("periodico", null);
		
		Consulta.mostrarNoticias();
		Consulta.insertarNoticias("La mejor noticia");
		Consulta.borrarNoticias("1 Noticia");
	}
}
