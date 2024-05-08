<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="com.entrega.model.Seccion"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-3"
	pageEncoding="ISO-8859-3"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-3">
<title>Insert title here</title>
</head>
<body>
	<form action="EditarServlet" method="post">
	
		<input type="hidden" name="id" value="${producto.getId()}">
		
		<label for="nombre">Nombre:</label> 
		<input type="text" id="nombre" name="nombre" value="${producto.getNombre()}" required>
		<br> 
		<label for="precio">Precio:</label> 
		<input type="number" id="precio" name="precio" min="0" step="0.01" value="${producto.getPrecio()}" required> 
		
		<br>
		
		<label for="stock">Stock:</label> 
		<input type="number" id="stock" name="stock" min="0" value="${producto.getStock()}" required>
	
		 <br> 
			
		<label for="seccion">Secci�n:</label>
		<select id="seccion" name="seccion">
			<option value="${producto.getSeccionString()}">${producto.getSeccionString()}<option>
			<c:forEach items="${Seccion.secciones}" end="${Seccion.secciones.size()}" var="seccion">
				<option value="${seccion.name().toLowerCase()}">${seccion.name().toLowerCase()}</option>
			</c:forEach>
		</select> 
		<br>
		<button type="submit">Editar</button>
	</form>
</body>
</html>