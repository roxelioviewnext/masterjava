package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TransporteServlet
 */
public class TransporteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<!DOCTYPE.html>");
		pw.println("<html lang =\"es\">");
		pw.println("<head>");
		pw.println("<meta charset = \"UTF-8\">");
		pw.println("<title>Formulario datos 01</title>");
		pw.println("</head>");
		pw.println("<body>");
		String transporte = request.getParameter("transporte");
		pw.print("Has seleccionado el transporte: " + transporte + "<br>");
		switch (transporte) {
		case "Coche" -> {
			pw.print("El coche se ha esfumado");
		}
		case "Tren" -> {
			pw.print("El tren ha salido, imposible que llegues a tu destino");
		}
		case "Avión" -> {
		pw.print("El avión ha volado y por eso no lo has pillado");
		}

		}

		pw.println("</body>");
		pw.println("</html>");
	}

}
