<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" session="true" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> Hello world from JSP !</h1>
	
	<% String name = "Dhruvik"; %>
	
	<p> Hello <%= name %></p>
	<p> Current Time: <%= new Date() %> </p>
	
	<%! 
		int count = 0;
		
		public int increment() {
			return ++count;
		}
	%>
	
	<h1>Count: <%= increment() %></h1>
	
</body>
</html>