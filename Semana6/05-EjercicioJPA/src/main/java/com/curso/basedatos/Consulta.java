package com.curso.basedatos;

import java.util.List;

import com.curso.model.Departamento;
import com.curso.model.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Consulta {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("empresadb");
	private EntityManager em;
	private TypedQuery<Departamento> departamento;
	private TypedQuery<Empleado> empleado;
	
	public Empleado encontrarEmpleado(int id) {
		em = emf.createEntityManager();
		Empleado empleado = em.find(Empleado.class, id);
		return empleado;
	}
	
	public List<Departamento> buscarTodosDepartamentos() {
		em = emf.createEntityManager();

		departamento = em.createNamedQuery("Departamento.buscarTodos", Departamento.class);

		return departamento.getResultList();
	}

	public List<Empleado> buscarEmpleadoPorDepartamentoId(int departamentoId) {
		em = emf.createEntityManager();

		empleado = em.createNamedQuery("Empleado.buscarEmpleadosPorDepartamento", Empleado.class);
		empleado.setParameter("departamentoId", departamentoId);

		return empleado.getResultList();
	}

	public List<Departamento> buscarDepartamentosPorMaxEpleados(int maxEmpleados) {
		em = emf.createEntityManager();

		departamento = em.createNamedQuery("Departamento.buscarDepartamentosPorMaxEpleados", Departamento.class);
		departamento.setParameter("maxEmpleados", maxEmpleados);

		return departamento.getResultList();
	}
	
	/*
	 * Recibe por parametros dos empleados y devuelve el empleado con mas tiempo en la empresa
	 */
	public Empleado buscarEmpleadoVeterano(Empleado e1, Empleado e2) {
		if (e1.getFecha().after(e2.getFecha())) {
			return e2;
		} else
			return e1;
	}
	
	public List<Empleado> buscarEmpleadosSueldoMenorPromedia() {
		em = emf.createEntityManager();

		empleado = em.createNamedQuery("Empleado.buscarEmpleadosSueldoMenorPromedia", Empleado.class);

		return empleado.getResultList();
	}

}
