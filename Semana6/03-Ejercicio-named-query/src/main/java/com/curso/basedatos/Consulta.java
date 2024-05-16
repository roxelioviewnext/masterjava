package com.curso.basedatos;

import java.util.List;

import com.curso.model.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class Consulta {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("alumnos");
	private EntityManager em;
	private TypedQuery<Alumno> alumno;

	public List<Alumno> buscarTodos() {
		em = emf.createEntityManager();

		alumno = em.createNamedQuery("buscarTodos", Alumno.class);

		return alumno.getResultList();
	}

	public List<Alumno> buscarPorId(int id) {
		em = emf.createEntityManager();

		alumno = em.createNamedQuery("buscarPorId", Alumno.class);
		alumno.setParameter("id", id);

		return alumno.getResultList();
	}

	public List<Alumno> buscarPorNombre(String nombre) {
		em = emf.createEntityManager();

		alumno = em.createNamedQuery("buscarPorNombre", Alumno.class);
		alumno.setParameter("nombre", nombre);

		return alumno.getResultList();
	}

	public List<Alumno> buscarPorApellido(String apellido) {
		em = emf.createEntityManager();

		alumno = em.createNamedQuery("buscarPorApellido", Alumno.class);
		alumno.setParameter("apellido", apellido);

		return alumno.getResultList();
	}

}
