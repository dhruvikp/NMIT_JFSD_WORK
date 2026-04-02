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
		String name = request.getParameter("name");
	%>
	
	<h1>Hello <%= name %></h1>
	
	<%-- <%
		response.sendRedirect("index.jsp");
	%> --%>

	<%
		out.println("Hello from jSP");
	%>
	
	<%
		session.setAttribute("user","Dhruvik");
	%>
	
	<h1>User: <%= session.getAttribute("user") %></h1>
	
	<%
		String servletName = config.getServletName();
	%>
	<h1>Servlet Name: <%= servletName %></h1>
	
	<%
		pageContext.setAttribute("msg","hello JSP", PageContext.SESSION_SCOPE);
	%>
	
	<h1> <%= pageContext.getAttribute("msg", PageContext.SESSION_SCOPE) %></h1>
	
	
	

</body>
</html>