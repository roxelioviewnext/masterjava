package com.curso.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
@NamedQueries({
	@NamedQuery(name = "Empleado.buscarEmpleadosPorDepartamento", query = "SELECT e FROM Empleado e WHERE e.departamento.idDept = :departamentoId"),
	@NamedQuery(name = "Empleado.buscarEmpleadosSueldoMenorPromedia", query = "SELECT e FROM Empleado e WHERE e.sueldo < (SELECT AVG(e.sueldo) FROM Empleado e)")
	
})
public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_emp", nullable = false)
	private int idEmpleado;
	
	private String nombre;
	private Date fecha;
	private double sueldo;
	
	@ManyToOne
	@JoinColumn(name = "id_dept")
	private Departamento departamento;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Empleado() {
	}

	public Empleado(int idEmpleado, String nombre, Date fecha, double sueldo, Departamento departamento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.fecha = fecha;
		this.sueldo = sueldo;
		this.departamento = departamento;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setIdEpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEmpleado;
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
		Empleado other = (Empleado) obj;
		if (idEmpleado != other.idEmpleado)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEpleado=");
		builder.append(idEmpleado);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append(", sueldo=");
		builder.append(sueldo);
		builder.append(", departamento=");
		builder.append(departamento);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
