package com.empresa.principal;

import java.time.LocalDate;

import com.empresa.clases.Empleado;
import com.empresa.conexion.Conexion;
import com.empresa.conexion.Consultas;

public class Principal {
	public static void main(String[] args) {
		
		Empleado empleado = new Empleado("Carlos", "Carmona", LocalDate.of(2000, 10, 10), 1900.23); 
		Empleado empleadoNuevo = new Empleado("Charlie", "Car", LocalDate.of(2000, 11, 10), 2900.23);
		Empleado obtenerEmpleado = Consultas.obtenerEmpleado(20);
		
		Consultas.insertarEmpleado(empleado);
		Consultas.eliminarEmpleado(obtenerEmpleado);
		
		Consultas.updateEmpleado(15, empleadoNuevo);
		
		System.out.println("\nLISTA EMPLEADOS");
		for (Empleado emp : Consultas.listarEmpleados()) {
			System.out.println(emp.toString());
		}
		System.out.println("\nLISTA EMPLEADOS POR APELLIDO");
		for (Empleado emp : Consultas.listarEmpleadosApellido("Pérez")) {
			System.out.println(emp.toString());
		}
	}
}
