package com.empresa.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static Connection conn = null;
	private static final String URL = "jdbc:mysql://localhost:3306/empresa";
	private static final String USER = "root";
	private static final String PWD = "abc123.";

	public static Connection getInstance() {
		if (conn == null) {
			try {
				conn = DriverManager.getConnection(URL, USER, PWD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
}
