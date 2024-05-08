package com.cursojava;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.cursojava.clases.Persona;

/**
 * Servlet implementation class MostrarPersonaServlet
 */
public class MostrarPersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Persona persona = new Persona(
								request.getParameter("nombre"),
								Integer.parseInt(request.getParameter("edad")),
								request.getParameter("direccion"));
		HttpSession sesion = request.getSession(true);
		sesion.setAttribute("persona", persona); 
		RequestDispatcher rd = request.getRequestDispatcher("/mostrarpersona.jsp");
		rd.forward(request, response);
	}

}
