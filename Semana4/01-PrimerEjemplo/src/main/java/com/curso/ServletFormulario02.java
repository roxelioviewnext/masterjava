package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletFormulario02
 */
public class ServletFormulario02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<!DOCTYPE.html>");
		pw.println("<html lang =\"es\">");
		pw.println("<head>");
		pw.println("<meta charset = \"UTF-8\">");
		pw.println("<title>Formulario datos 01</title>");
		pw.println("</head>");
		pw.println("<body>");
		
		int num = Integer.parseInt(request.getParameter("numero"));
		for (int i = 0; i < num; i++) {
			pw.println("Hola "+ request.getParameter("nombre") + "<br>");
		}
		
		
		
		pw.println("</body>");
		pw.println("</html>");
	}

}
