<%@page import="com.cursojava.Lista"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<select>
	<%
	
	for(int i = 0; i < Lista.lista.size(); i++){
		%> <option value="<%= i %>"> <%=Lista.lista.get(i) %></option><%
	}
	%>
	</select>
	<p>
	<%
	
	for(int i = 0; i < Lista.lista.size(); i++){
		%> <strong><%=Lista.lista.get(i) + " "%></strong><%
	}
	%>
	</p>
	<p>
	<%
	
	for(int i = 0; i < Lista.lista.size(); i++){%>
		<strong><%=Lista.lista.get(i) + " "%></strong><br><%
	}
	%>
	</p>
</body>
</html>