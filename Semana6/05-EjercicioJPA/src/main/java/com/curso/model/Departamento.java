package com.curso.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")
@NamedQueries({
		@NamedQuery(name = "Departamento.buscarTodos", query = "SELECT d FROM Departamento d"),
		@NamedQuery(name = "Departamento.buscarDepartamentosPorMaxEpleados", query = "SELECT d FROM Departamento d WHERE SIZE(d.empleados) <= :maxEmpleados")
})
public class Departamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_dept", nullable = false)
	private int idDept;

	private String nombre;
	private String localidad;

	@OneToMany(mappedBy = "departamento")
	private List<Empleado> empleados = new ArrayList<Empleado>();

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getIdDept() {
		return idDept;
	}

	public String getNombre() {
		return nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setIdDept(int idDept) {
		this.idDept = idDept;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDept;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		if (idDept != other.idDept)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Departamento [idDept=");
		builder.append(idDept);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append("]");
		return builder.toString();
	}

}
