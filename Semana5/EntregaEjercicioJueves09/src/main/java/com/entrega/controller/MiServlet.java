package com.entrega.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.entrega.model.Producto;
import com.entrega.model.Seccion;
import com.entrega.service.Almacen;

/**
 * Servlet implementation class MiServlet
 */
public final class MiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Producto producto = new Producto(
				Seccion.valueOf(request.getParameter("seccion").toUpperCase()),
				request.getParameter("nombre"),
				Double.parseDouble(request.getParameter("precio")),
				Integer.parseInt(request.getParameter("stock")));
		if (producto != null) {
			Almacen.agregarProducto(producto);
		}
		request.getRequestDispatcher("/formulario.jsp").forward(request, response);
	}

}
