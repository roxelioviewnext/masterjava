package com.curso.consulta;

import java.util.List;

import com.curso.model.Noticia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Consulta {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("periodico");
	private static EntityManager em = emf.createEntityManager();
	
	/*
	 * Muestra por pantalla todas las noticias
	 */
	public static void mostrarNoticias() {
		TypedQuery<Noticia> consulta = em.createQuery("Select n FROM Noticia n", Noticia.class);
		List<Noticia> noticias = consulta.getResultList();
		for (Noticia noticia : noticias) {
			System.out.println(noticia);
		}
		
	}
	/*
	 * Inserta la noticia con el string introducido por parametro
	 */
	public static void insertarNoticias(String titulo) {
		em.getTransaction().begin();
		Noticia noticia = em.find(Noticia.class, titulo);
		em.persist(noticia);
		em.getTransaction().commit();
		
	}
	/*
	 * Borra la noticia con el string introducido por parametro
	 */
	public static void borrarNoticias(String titulo) {
		
		em.getTransaction().begin();
		Noticia noticia = em.find(Noticia.class, titulo);
		em.remove(noticia);
		em.getTransaction().commit();
		
		
	}
}
