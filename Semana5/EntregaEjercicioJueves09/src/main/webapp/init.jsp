<%@page import="com.entrega.model.Seccion"%>
<%@page import="com.entrega.service.Almacen"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Productos</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>	
	<form action="FiltrarProductosServlet" method="post">
        <label for="seccion">Filtrar por Sección:</label>
        <select name="seccion" id="seccion">
         	<option value="">Todas las secciones</option>
            <c:forEach items="${Seccion.secciones}" var="seccion">
                <option value="${seccion.name().toLowerCase()}">${seccion.name().toLowerCase()}</option>
            </c:forEach>
        </select>
        <button type="submit">Filtrar</button>
    </form>
    <table border="1">
        <thead>
            <tr>
                <th>Nombre</th>
                <th>Sección</th>
                <th>Stock</th>
                <th>Precio</th>
                <th>Editar</th>
                <th>Eliminar</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${Almacen.productosFiltrados}" var="producto">
                <tr>
                    <td>${producto.getNombre()}</td>
                    <td>${producto.getSeccionString()}</td>
                    <td>${producto.getStock()}</td>
                    <td>${producto.getPrecio()}€</td>
                    <td>
                        <form action="EditarServlet" method="get">
                            <input type="hidden" name="idEditar" value="${producto.getId()}">
                            <button type="submit" >Editar</button>
                        </form>
                    </td>
                    <td>
                        <form action="EliminarServlet" method="post">
                            <input type="hidden" name="idEliminar" value="${producto.getId()}">
                            <button type="submit">Eliminar</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <button class="add-btn" onclick="window.location.href='insertproduct.jsp'">Añadir un producto</button>
</body>
</html>
