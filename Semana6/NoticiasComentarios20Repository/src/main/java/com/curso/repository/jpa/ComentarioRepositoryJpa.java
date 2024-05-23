package com.curso.repository.jpa;

import com.curso.model.Comentario;
import com.curso.repository.ComentarioRepository;

import jakarta.persistence.EntityManager;

public class ComentarioRepositoryJpa implements ComentarioRepository {
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}
	
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	public Comentario findOne(int num) {
		return em.find(Comentario.class, num);
	}

	public Iterable<Comentario> findAll() {
		return em.createQuery("SELECT c FROM Comentario c").getResultList();
	}

	public void save(Comentario comentario) {
		em.persist(comentario);
	}

	public void delete(Comentario comentario) {
		em.remove(comentario);
	}

}
