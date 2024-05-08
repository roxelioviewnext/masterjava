<%@page import="com.curso.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%  %>
	<%
	Usuario usuario = (Usuario)session.getAttribute("usuario");
	if (usuario != null) {
		out.println("Bienvenido: " + usuario.getNombre() + "<br>");
		%> <div>Matriculas: </div> 
		<ul>
		<%
		for(int i = 0; i < usuario.getMatriculas().size(); i++){
			%> <li> <%=usuario.getMatriculas().get(i)%></li> <%
		}
		%></ul><%

	}
	%>
	<p>Si quieres matricularte en un curso clicka en el enlace</p>
	<a href="agregarmatriculas.html">Matricularse</a>


	<p>Si quieres desmatricularte en un curso clicka en el enlace</p>
	<a href="eliminarmatriculas.html">Desmatricularse</a>
</body>
</html>