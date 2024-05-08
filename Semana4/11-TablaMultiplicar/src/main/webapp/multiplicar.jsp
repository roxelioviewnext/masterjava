<%@page import="javax.imageio.metadata.IIOMetadataFormatImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tabla multiplicar</title>
</head>
<body>
	<table border="1">
		<%
		for (int i = 1; i <= 10; i++) {
		%>
		<tr>
			<%
			for (int y = 1; y <= 10; y++) {
			%><td>
				<%
				out.print(i * y);
				%>
			</td>
			<%
			}
			%>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>