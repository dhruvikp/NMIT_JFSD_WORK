<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp" />

	<jsp:useBean id="user" class="com.example.User" scope="session" />
	
	<jsp:setProperty name="user" property="name" value="Dhruvik" />
	
	<h1>
		Welcome,
		<jsp:getProperty name="user" property="name" />
	</h1>
	
	
	<%-- <jsp:forward page="index.jsp" /> --%>

</body>
</html>