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
       
	/*
	 * Metodo doGet
	 * Recoge el id del producto, busca dentro de almacen un producto con ese id
	 * Muestra la vista editptoduct.jsp
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productoId = Integer.parseInt(request.getParameter("idEditar"));
		Producto producto = Almacen.getProducto(productoId);
		request.setAttribute("producto", producto);
		request.getRequestDispatcher("/editproduct.jsp").forward(request, response);
	}
	
	/*
	 * Metodo doPost
	 * Recoge el id del producto, crea un producto auxiliar para editar el producto de la clase almacen
	 * Al final redirige a la pagina principal
	 */
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
		
		response.sendRedirect("init.jsp");
	}

}
