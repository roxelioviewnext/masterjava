package com.curso.principal;

import java.util.List;

import com.curso.model.Pelicula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Principal6 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclub");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Pelicula> pelicula = em.createQuery("SELECT p FROM Pelicula p WHERE p.precioAlquiler > 20 AND p.precioAlquiler < 55", Pelicula.class); 
		List<Pelicula> peliculas =  pelicula.getResultList();
		for (Pelicula peli : peliculas) {
			System.out.println(peli);
		}
	}
}	
