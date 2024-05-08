package com.curso;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nombre = request.getParameter("name");

		String contra = request.getParameter("pwd");
		if (contra.equals(nombre)) {
			HttpSession sesion = request.getSession(true);
			sesion.setAttribute("usuario", new Usuario(nombre));
			RequestDispatcher rd = request.getRequestDispatcher("/bienvenida.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/formulario.html");
			rd.include(request, response);
		}
	}

}
