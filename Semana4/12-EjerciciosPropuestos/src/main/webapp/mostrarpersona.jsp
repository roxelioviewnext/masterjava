<%@page import="com.cursojava.clases.Persona"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="MostrarPersonaServlet" method="post">
	Nombre:<input type="text" name="nombre">
	Edad:<input type="number" name="edad">
	Direccion:<input type="text" name="direccion">
	<input type="submit" value="Enviar">
	</form>
	<%
	if((Persona)session.getAttribute("persona") != null){
	Persona persona = (Persona)session.getAttribute("persona");
	%> <p>Nombre: <%=persona.getNombre()%>
		  Edad: <%=persona.getEdad()%>
		  Direccion: <%=persona.getDireccion()%></p> 
	<% } %>
</body>
</html>