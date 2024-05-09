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
	<title>Añadir producto</title>
	<link rel="stylesheet" href="css/insert.css">
	<link rel="stylesheet" href="css/botones.css">
</head>
<body>
	<form action="EditarServlet" method="post">
		<input type="hidden" name="id" value="${producto.getId()}">
		<table>
			<tr>
				<td><label for="nombre">Nombre:</label></td>
				<td><input type="text" id="nombre" name="nombre" value="${producto.getNombre()}" required></td>
			</tr>
			
			<tr>
				<td><label for="precio">Precio:</label> </td>
				<td><input type="number" id="precio" name="precio" min="0" step="0.01" value="${producto.getPrecio()}" required></td>
			</tr> 

			<tr>
				<td><label for="stock">Stock:</label></td>
				<td><input type="number" id="stock" name="stock" min="0" value="${producto.getStock()}" required></td>
			</tr>

			<tr>
				<td><label for="seccion">Sección:</label></td>
				<td><select id="seccion" name="seccion">
						<option value="${producto.getSeccionString()}" selected>${producto.getSeccionString()}</option>			
					<c:forEach items="${Seccion.secciones}" var="seccion">
						<c:if test="${!seccion.equals(producto.getSeccion())}">
							<option value="${seccion.name().toLowerCase()}">${seccion.name().toLowerCase()}</option>
						</c:if>	
					</c:forEach>
				</select>
				</td>
			</tr> 
		</table>
		
		<button class="add-btn" type="submit">Editar</button>
	</form>
</body>
</html>