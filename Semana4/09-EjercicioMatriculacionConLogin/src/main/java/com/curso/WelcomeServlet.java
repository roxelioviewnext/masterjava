package com.curso;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sesion = request.getSession();

		Usuario usuario = (Usuario) sesion.getAttribute("usuario");

		String agregarmatricula = request.getParameter("agregarmatricula");
		String eliminarmatricula = request.getParameter("eliminarmatricula");
		if (usuario != null) {
			if ( agregarmatricula != null && !agregarmatricula.isBlank()) {
				usuario.agregarMatricula(agregarmatricula);
			}

			if (eliminarmatricula != null && !eliminarmatricula.isBlank()) {
				usuario.eliminarMatricula(eliminarmatricula);
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher("/bienvenida.jsp");
		rd.forward(request, response);

	}
	

}
