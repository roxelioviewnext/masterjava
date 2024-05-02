package com.empresa.conexion;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.empresa.clases.Empleado;

public class Consultas {
	public static void insertarEmpleado(Empleado empleado) {
		String consulta = "INSERT INTO empleados(nombre, apellido, fecha_nacimiento, salario) VALUES (?, ?, ?, ?)";

		try (PreparedStatement pstm = Conexion.getInstance().prepareStatement(consulta)) {
			pstm.setString(1, empleado.getNombre());
			pstm.setString(2, empleado.getApellido());
			pstm.setDate(3, Date.valueOf(empleado.getFechaNacimiento()));
			pstm.setDouble(4, empleado.getSalario());

			pstm.executeUpdate();
			System.out.println("--insert done--");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void eliminarEmpleado(Empleado empleado) {
		String consulta = "DELETE FROM empleados WHERE id = ?";

		try (PreparedStatement pstm = Conexion.getInstance().prepareStatement(consulta)) {
			pstm.setInt(1, empleado.getId());

			pstm.executeUpdate();
			System.out.println("--delete done--");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void updateEmpleado(int id, Empleado empleadoNuevo) {
		String consulta = "UPDATE empleados SET nombre = ?, apellido = ?, fecha_nacimiento = ?, salario = ? WHERE id = ?";

		try (PreparedStatement pstm = Conexion.getInstance().prepareStatement(consulta)) {
			pstm.setString(1, empleadoNuevo.getNombre());
			pstm.setString(2, empleadoNuevo.getApellido());
			pstm.setDate(3, Date.valueOf(empleadoNuevo.getFechaNacimiento()));
			pstm.setDouble(4, empleadoNuevo.getSalario());
			pstm.setInt(5, id);

			pstm.executeUpdate();
			System.out.println("--update done--");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Empleado obtenerEmpleado(int idEmpleado) {
		String consulta = "SELECT * FROM empleados WHERE id = ?";
		Empleado empleado = new Empleado();
		try (PreparedStatement pstm = Conexion.getInstance().prepareStatement(consulta)) {
			pstm.setInt(1, idEmpleado);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				empleado.setId(rs.getInt(1));
				empleado.setNombre( rs.getString(2));
				empleado.setApellido(rs.getString(3));
				empleado.setFechaNacimiento(rs.getDate(4).toLocalDate());
				empleado.setSalario(rs.getDouble(5));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empleado;
	}

	public static List<Empleado> listarEmpleados() {
		String consulta = "SELECT * FROM empleados";
		List<Empleado> lista = new ArrayList<>();
		try (PreparedStatement pstm = Conexion.getInstance().prepareStatement(consulta)) {
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				Empleado empleado = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getDate(4).toLocalDate(), rs.getDouble(5));
				lista.add(empleado);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}

	public static List<Empleado> listarEmpleadosApellido(String apellido) {
		String consulta = "SELECT * FROM empleados WHERE apellido = ?";
		List<Empleado> lista = new ArrayList<>();
		try (PreparedStatement pstm = Conexion.getInstance().prepareStatement(consulta)) {
			pstm.setString(1, apellido);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				Empleado empleado = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getDate(4).toLocalDate(), rs.getDouble(5));
				lista.add(empleado);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
}
