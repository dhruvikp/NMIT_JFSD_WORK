<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file = "header.jsp" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
	
	<c:forEach var="i" begin="1" end="5">
		<h1>${i}</h1>
	</c:forEach>
	
	
	
	<h2>Welcome to Home Page</h2>
</body>
</html>