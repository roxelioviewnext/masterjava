package com.curso.principal;

import com.curso.basedatos.Consulta;
import com.curso.model.Departamento;
import com.curso.model.Empleado;

import jakarta.persistence.Persistence;

public class Principal {
	public static void main(String[] args) {
		Persistence.generateSchema("empresadb", null);

		Consulta consulta = new Consulta();
		Empleado e1 = consulta.encontrarEmpleado(2);
		Empleado e2 = consulta.encontrarEmpleado(3);
		
		
		// MOSTRAR EL EMPLEADO MAS VETERANO DADOS DOS
		System.out.println("MOSTRAR EL EMPLEADO MAS VETERANO DADOS DOS");
		Empleado aux = consulta.buscarEmpleadoVeterano(e1, e2);
		System.out.println(aux);

		// MOSTRAR TODOS LOS DEPARTAMENTOS
		System.out.println("MOSTRAR TODOS LOS DEPARTAMENTOS");
		for (Departamento departamento : consulta.buscarTodosDepartamentos()) {
			System.out.println(departamento);
		}

		// MOSTRAR TODOS LOS EMPLEADOS DE UN DEPARTAMENTO
		System.out.println("MOSTRAR TODOS LOS EMPLEADOS DE UN DEPARTAMENTO");
		for (Empleado empleado : consulta.buscarEmpleadoPorDepartamentoId(6)) {
			System.out.println(empleado);
		}

		// MOSTRAR LOS DEPARTAMENTOS CON MENOS DE UN NUMERO DE EMPLEADOS
		System.out.println("MOSTRAR LOS DEPARTAMENTOS CON MENOS DE UN NUMERO DE EMPLEADOS");
		for (Departamento departamento : consulta.buscarDepartamentosPorMaxEpleados(1)) {
			System.out.println(departamento);
		}

		// MOSTRAR TODOS LOS EMPLEADOS CON SUELDO MENOR AL PROMEDIO
		System.out.println("MOSTRAR TODOS LOS EMPLEADOS CON SUELDO MENOR AL PROMEDIO");
		for (Empleado empleado : consulta.buscarEmpleadosSueldoMenorPromedia()) {
			System.out.println(empleado);
		}

	}
}
