package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LeerSesionProducto
 */
public class LeerSesionProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		Producto producto = (Producto) sesion.getAttribute("producto");
		if(producto != null) {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			pw.print("<!DOCTYPE html>");
			pw.print("<body>");
			pw.print("<div>" + "id: "+ producto.getId()+ "</div>");
			pw.print("<div>" + "concepto: "+ producto.getConcepto()+ "</div>");
			pw.print("<div>" + "precio: "+ producto.getPrecio()+ "</div>");
			pw.print("</body>");
		}
	}


}
