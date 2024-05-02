package com.proyecto.principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal {
	private static final String URL = "jdbc:mysql://localhost:3306/ejemplo";
	private static final String USER = "root";
	private static final String PWD = "abc123.";

	public static void main(String[] args) {
		try (Connection conexion = DriverManager.getConnection(URL, USER, PWD)) {
			
			generarConsultaParametrizada("SELECT * FROM personas WHERE nombre = ? ", "Ana", conexion);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void generarConsultaParametrizada(String sql, String nombre, Connection conexion) {

		try (PreparedStatement pstm = conexion.prepareStatement(sql)) {
			pstm.setString(1, nombre);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt("id"));
				System.out.print(" ");
				System.out.print(rs.getString("nombre"));
				System.out.print(" ");
				System.out.print(rs.getString("apellido"));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
