<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="MiServlet" method="post">
		Examen 1:<input type="number" name="examen1">
		Examen 2:<input type="number" name="examen2">
		Examen 3:<input type="number" name="examen3"> 
		
		<input type="submit" value="Calcular media">
	</form>
	
	<% 
	
	if (session.getAttribute("media") != null) { 
	double media = (double)session.getAttribute("media"); %>
		<div> Tu media es <%=media%></div>
	<%   if(media >= 5){ %>
			<div> Has aprobado !!! </div>
	<%   }else { %>
			<div> Has suspendido :( </div>
	<%   } 
	}
	%>
</body>
</html>