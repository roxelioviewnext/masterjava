package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet01
 */
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<!DOCTYPE.html>");
		pw.println("<html lang =\"es\">");
		pw.println("<head>");
		pw.println("<meta charset = \"UTF-8\">");
		pw.println("<title>Saluditos</title>");
		pw.println("</head>");
		pw.println("<body>");
						
		for (int i = 0; i < 10; i++) {
			pw.println(request.getParameter("param") + "<br>");
			
		}
		
		pw.println("</body>");
		pw.println("</html>");
	}

}
