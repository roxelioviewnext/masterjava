<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="com.entrega.model.Seccion"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-3" pageEncoding="ISO-8859-3"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-3">
	<title>Insertar producto</title>
	<link rel="stylesheet" href="css/insert.css">
	<link rel="stylesheet" href="css/botones.css">
</head>
<body>
	<form action="InsertarServlet" method="post">
		<table>
			<tr>
				<td><label for="nombre">Nombre:</label></td>  
				<td><input type="text" id="nombre" name="nombre" required></td> 
				</tr>
			
			<tr>
				<td><label for="precio">Precio:</label></td>
				<td><input type="number" id="precio" name="precio" min="0" step="0.01" required></td>
			</tr> 
			
			<tr>
				<td><label for="stock">Stock:</label></td> 
				<td><input type="number" id="stock" name="stock" min="0" required></td> 
			</tr> 
			
			<tr>
				<td><label for="seccion">Sección:</label> </td>
				<td><select id="seccion" name="seccion">
					<c:forEach items="${Seccion.secciones}" var="seccion">
						<option value="${seccion.name()}">${seccion.name().toLowerCase()}</option>
					</c:forEach>
				</select></td>
			</tr> 
		</table>
		
		<button class="add-btn" type="submit">Insertar</button>
	</form>
</body>
</html>