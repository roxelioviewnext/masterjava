package com.curso.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.curso.model.Noticia;
import com.curso.repository.jpa.NoticiaRepositoryJpa;

public class NoticiaRepositoryTest extends JpaUnitTest {
	NoticiaRepositoryJpa noticiaRepositoryJpa;
	
	@BeforeEach
	public void setUp() {
		super.setUpTest();
		noticiaRepositoryJpa = new NoticiaRepositoryJpa();
		noticiaRepositoryJpa.setEm(em);
	}
	
	@Test
	void inyectarEntityManagerTest() {
		assertEquals(em, noticiaRepositoryJpa.getEm());
	}
	
	@Test
	public void seleccionarTodasNoticiasTest() {
		Noticia noticia = noticiaRepositoryJpa.findAll().iterator().next();
		assertEquals("Por fin lunes", noticia.getTitulo());
	}
	
	@Test
	public void insertarNoticiaTest() {
		
		em.getTransaction().begin();
		Noticia noticia = new Noticia("ya es miercoles", "ana", LocalDate.now());
		noticiaRepositoryJpa.save(noticia);
		em.getTransaction().commit();
		Noticia noticiaInsertada = noticiaRepositoryJpa.findOne("ya es miercoles");
		assertEquals(noticiaInsertada, noticia);
	}
}
