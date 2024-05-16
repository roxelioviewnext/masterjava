package com.curso.consulta.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.curso.model.Noticia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConsultaTest {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	@BeforeEach
	void iniciar() {
		emf = Persistence.createEntityManagerFactory("periodico");
		em = emf.createEntityManager();
	}
	
	@Test
	public void seleccionarNoticiaTest() {
		Noticia noticia = em.find(Noticia.class, "1 Noticia");
		assertEquals("Jefe", noticia.getAutor());
		
	}
	
	@Test
	public void insertarNoticiaTest() {
		Noticia noticia = new Noticia("Mi noticia", "Pepiño", Date.valueOf("2020-10-10"));
		
		em.getTransaction().begin();
		em.persist(noticia);
		em.getTransaction().commit();
		
		Noticia noticiaInsertada = em.find(Noticia.class, "Mi noticia");
		assertEquals("Pepiño", noticiaInsertada.getAutor());
		
	}
	
	@Test
	public void borrarNoticiaTest() {
		Noticia noticia = em.find(Noticia.class, "1 Noticia");
		
		em.getTransaction().begin();
		
		em.remove(noticia);
		
		em.getTransaction().commit();
		
		Noticia noticiaBorrada = em.find(Noticia.class, "1 Noticia");
		assertNull(noticiaBorrada);
		
	}
}
