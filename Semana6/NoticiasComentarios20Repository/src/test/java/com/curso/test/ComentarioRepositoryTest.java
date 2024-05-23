package com.curso.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.curso.model.Comentario;
import com.curso.repository.jpa.ComentarioRepositoryJpa;

public class ComentarioRepositoryTest extends JpaUnitTest {
	ComentarioRepositoryJpa comentarioRepositoryJpa;

	@BeforeEach
	public void setUp() {
		super.setUpTest();
		comentarioRepositoryJpa = new ComentarioRepositoryJpa();
		comentarioRepositoryJpa.setEm(em);
	}
	
	@Test
	void inyectarEntityManagerTest() {
		assertEquals(em, comentarioRepositoryJpa.getEm());
	}
	
	@Test
	public void seleccionarTodosComentariosTest() {
		Comentario comentario = comentarioRepositoryJpa.findAll().iterator().next();
		assertEquals("manolito", comentario.getAutor());
	}
	
	
	@Test
	public void seleccionarComentarioTest() {
		Comentario comentario = comentarioRepositoryJpa.findOne(1);
		assertEquals("que Bien", comentario.getTexto());
	}
	

}
