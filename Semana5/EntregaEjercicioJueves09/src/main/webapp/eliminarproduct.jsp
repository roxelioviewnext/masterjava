<%@ page language="java" contentType="text/html; charset=ISO-8859-3"
    pageEncoding="ISO-8859-3"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-3">
<title>Insert title here</title>
</head>
<body>
	<form action="EliminarServlet" method="post">
		<label for="nombre">Nombre:</label> 
		<input type="text" id="nombre" name="nombre" disabled> <br> 

		<label for="precio">Precio:</label>
		<input type="number" id="precio" name="precio" step="0.01" disabled> <br> 		
		
		<label for="stock">Stock:</label> 
		<input type="number" id="stock" name="stock" min="0" disabled> <br> 
		
		<label for="seccion">Sección:</label> 
		<input type="text" id="seccion" name="seccion" disabled> <br> 
		
		<input type="submit" value="Eliminar">
	</form>
</body>
</html>