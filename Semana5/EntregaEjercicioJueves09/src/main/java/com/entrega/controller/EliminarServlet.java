package com.entrega.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.entrega.model.Producto;
import com.entrega.model.Seccion;
import com.entrega.service.Almacen;

/**
 * Servlet implementation class EliminarServlet
 */
public class EliminarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productoId = Integer.parseInt(request.getParameter("idEliminar"));
		Producto producto = Almacen.getProducto(productoId);
		if(producto != null) {
			Almacen.eliminarProducto(producto);
		}
		
		request.getRequestDispatcher("FiltrarProductosServlet").forward(request, response);
		
	}

}
