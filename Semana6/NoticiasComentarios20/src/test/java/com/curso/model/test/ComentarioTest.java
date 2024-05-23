package com.curso.model.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.curso.model.Comentario;
import com.curso.model.Noticia;

class ComentarioTest extends JpaUnitTest {
	@Test
	void seleccionarComentarioInicialTest() {
		Comentario comentario = em.find(Comentario.class, 1);
		
		assertEquals("manolito", comentario.getAutor());
	}
	
	@Test
	void seleccionarComentarioDeNoticiaTest() {
		Noticia noticia = em.find(Noticia.class, "Por fin lunes");
		Comentario comentario = noticia.getComentarios().get(0);
		
		assertEquals("manolito", comentario.getAutor());
		
	}
	
}
