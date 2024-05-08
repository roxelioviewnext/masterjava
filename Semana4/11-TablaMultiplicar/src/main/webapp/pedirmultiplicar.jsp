<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String numero = request.getParameter("numero");
	
	%>
	<h2>Has comprado <%=numero %> unidades del producto con codigo</h2>
</body>
</html>