package com.cursojava;

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
 * Servlet implementation class MiServlet
 */
public class MiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double num1 = Double.parseDouble(request.getParameter("examen1"));
		double num2 = Double.parseDouble(request.getParameter("examen2"));
		double num3 = Double.parseDouble(request.getParameter("examen3"));
		double media = (num1 + num2 + num3) / 3;
		HttpSession sesion = request.getSession(true);
		sesion.setAttribute("media", media); 
		RequestDispatcher rd = request.getRequestDispatcher("/calcularmedia.jsp");
		rd.forward(request, response);
	}

}
