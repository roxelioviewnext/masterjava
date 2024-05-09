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
public final class InsertarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * Metodo doPost
	 * Recoge los parametros(seccion, nombre, precio ,stock), crea un producto con esos parametros 
	 * y lo agrega a la lista de productos
	 * Redirige a init.jsp
	 * 
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
		response.sendRedirect("init.jsp");
	}

}
