package com.entrega.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.entrega.model.Producto;
import com.entrega.model.Seccion;
import com.entrega.service.Almacen;

/**
 * Servlet implementation class EditarServlet
 */
public class EditarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productoId = Integer.parseInt(request.getParameter("idEditar"));
		Producto producto = Almacen.getProducto(productoId);
		request.setAttribute("producto", producto);
		request.getRequestDispatcher("/editproduct.jsp").forward(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productoId = Integer.parseInt(request.getParameter("id"));
		Producto producto = new Producto(productoId,
				Seccion.valueOf(request.getParameter("seccion").toUpperCase()),
				request.getParameter("nombre"),
				Double.parseDouble(request.getParameter("precio")),
				Integer.parseInt(request.getParameter("stock")));
		if (producto != null) {
			Almacen.editarProducto(producto);
		}
		
		request.getRequestDispatcher("/formulario.jsp").forward(request, response);
	}

}
