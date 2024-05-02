package com.curso;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Mayusculas
 */
public class MayusculaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //Este servlet convierte el valor del userName a mayúscula
            //y no genera contenido. Eso se lo deja al ServletFinal
            
            String nombre=request.getParameter("userName");
            request.setAttribute("userName", nombre.toUpperCase());
            RequestDispatcher despachador =        request.getRequestDispatcher("/ServletFinal");
            despachador.forward(request, response);
    }

}
