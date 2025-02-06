<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME TO DISPLAY PAGE</h1>
<% String name=(String) request.getAttribute("name");
Integer id=(Integer) request.getAttribute("id");
%>
<h2> <%=name %></h2>
<h2> <%=id %></h2>
</body>
</html>