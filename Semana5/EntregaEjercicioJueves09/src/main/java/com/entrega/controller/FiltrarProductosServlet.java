package com.entrega.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.entrega.service.Almacen;

/**
 * Servlet implementation class FiltrarProductosServlet
 */
public class FiltrarProductosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    
	/**
	 * Metodo doPost
	 * Modifica la lista que se muestra en init.jsp dependiendo de la seccion que se le pase por parametro
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String seccion = request.getParameter("seccion");
		Almacen.productosFiltrados = Almacen.filtrarSeccion(seccion);
		
		request.getRequestDispatcher("/init.jsp").forward(request, response);
	}

}
