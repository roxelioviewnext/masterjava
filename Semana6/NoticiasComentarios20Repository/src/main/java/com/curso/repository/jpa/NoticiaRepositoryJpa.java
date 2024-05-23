package com.curso.repository.jpa;

import com.curso.model.Noticia;
import com.curso.repository.NoticiaRepository;

import jakarta.persistence.EntityManager;

public class NoticiaRepositoryJpa implements NoticiaRepository {
	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public Noticia findOne(String titulo) {
		return em.find(Noticia.class, titulo);
	}
	
	public Iterable<Noticia> findAll() {
		return em.createQuery("SELECT n FROM Noticia n").getResultList();
	}
	
	public void save(Noticia noticia) {
		em.persist(noticia);
	}

	public void delete(Noticia noticia) {
		em.remove(noticia);
	}

}
