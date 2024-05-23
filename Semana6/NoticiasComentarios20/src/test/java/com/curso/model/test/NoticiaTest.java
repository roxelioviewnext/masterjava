package com.curso.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.curso.model.Noticia;


class NoticiaTest extends JpaUnitTest {
	@Test
	@Order(1)
	void seleccionarNoticiaInicialTest() {
		Noticia noticia = em.find(Noticia.class, "Por fin lunes");
		assertEquals("pepito", noticia.getAutor());
	}

	@Test
	@Order(3)
	void borrarNoticiaInicialTest() {
		Noticia noticia = em.find(Noticia.class, "Por fin lunes");

		em.getTransaction().begin();
		em.remove(noticia);
		em.getTransaction().commit();
		Noticia sinNoticia = em.find(Noticia.class, "Por fin lunes");
		assertNull(sinNoticia);
	}
	
	@Test
	@Order(2)
	void insertarNoticiaTest() {
		
		em.getTransaction().begin();
		Noticia noticia = new Noticia("Otra noticia", "pepito", LocalDate.of(2020, 10, 10));
		em.persist(noticia);
		em.getTransaction().commit();
		Noticia noticiaInsertada = em.find(Noticia.class, "Otra noticia");
		assertEquals("pepito", noticiaInsertada.getAutor());
	}
	

}
