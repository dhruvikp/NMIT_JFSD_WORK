<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.*, com.simplilearn.model.Employee, com.simplilearn.dao.EmployeeDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Employee List</h2>

	<a href="add.jsp">Add Employee</a>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Salary</th>
			<th>Action</th>
		</tr>

		<%
		List<Employee> list = EmployeeDAO.getAll();

		for (Employee e : list) {
		%>

		<tr>
			<td><%=e.getId()%></td>
			<td><%=e.getName()%></td>
			<td><%=e.getEmail()%></td>
			<td><%=e.getSalary()%></td>

			<td><a href="employee?action=delete&id=<%=e.getId()%>">Delete</a></td>

		</tr>

		<%
		}
		%>


	</table>

</body>
</html>