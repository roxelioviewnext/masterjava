package com.curso.principales;


import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class SelectObject {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclub");
		EntityManager em = emf.createEntityManager();
	
		TypedQuery<Object[]> consulta = em.createQuery("SELECT COUNT(l.precio), l.precio FROM Libro l GROUP BY l.precio", Object[].class);
		
		List<Object[]> lista = consulta.getResultList();
		for (Object[] objecto : lista) {
			System.out.println("De precio " + objecto[1] + " hay " +objecto[0]+ " elementos");
		}
	}
}
