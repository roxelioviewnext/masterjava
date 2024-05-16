package com.curso.principal;

import java.util.List;

import com.curso.model.Pelicula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Principal5 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclub");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<String> director = em.createQuery("SELECT p.director FROM Pelicula p", String.class); 
		List<String> directores =  director.getResultList();
		for (String dir: directores) {
			System.out.println(dir);
		}
	}
}	
