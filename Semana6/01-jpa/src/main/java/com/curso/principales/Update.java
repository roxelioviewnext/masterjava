package com.curso.principales;

import com.curso.model.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
	
		Libro libro = em.find(Libro.class, "1A");
		
		
		em.getTransaction().begin();
		libro.setAutor("Sebas");
		libro.setPrecio(67);
		em.merge(libro);
		em.getTransaction().commit();
	}
}
