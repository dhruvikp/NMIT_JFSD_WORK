package com.simplilearn.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.dao.EmployeeDAO;
import com.simplilearn.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	EmployeeDAO dao = new EmployeeDAO();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String action = request.getParameter("action");
		try {
			
			if(action == null || action.equals("list")) {
				List<Employee> list = dao.getAll();
				
				out.println("<h2> Employee List </h2>");
				out.println("<a href='?action=add'> Add Employee </a><br/><br/> ");
				out.println("<table border='1'>");
				out.println("<tr><th>ID</th><th>Name</th><th>Email</th><th>Salary</th><th>Action</th></tr>");
				
				for(Employee e : list) {
					out.println("<tr>");
					out.println("<td>"+e.getId()+"</td>");
					out.println("<td>"+e.getName()+"</td>");
					out.println("<td>"+e.getEmail()+"</td>");
					out.println("<td>"+e.getSalary()+"</td>");
					
					out.println("<td>");
					out.println("<a href='?action=edit&id="+e.getId()+"'> Edit</a> ");
					out.println("<a href='?action=delete&id="+e.getId()+"'> Delete</a> ");
					out.println("</td>");
					out.println("</tr>");
				}
				out.println("</table>");
			}
			else if(action.equals("add")) {
				
				out.println("<h2> Add Employee </h2>");
				out.println("<form action='employee' method='POST'>");
				out.println("<input type='hidden' name='action' value='insert'/>");
				out.println("Name: <input name='name' /><br/>");
				out.println("Email: <input name='email' /><br/>");
				out.println("Salary: <input name='salary' /><br/>");
				out.println("<input type=submit>Add</input>");
				out.println("</form>");
			}
			else if(action.equals("edit")) {
				int id = Integer.parseInt(request.getParameter("id"));
				Employee e= dao.getById(id);
				
				out.println("<h2> Edit Employee </h2>");
				out.println("<form action='employee' method='post'>");
				out.println("<input type='hidden' name='action' value='update' />");
				out.println("<input type='hidden' name='id' value="+e.getId()+" />");
				out.println("Name: <input name='name' value='"+e.getName()+"'/><br/>");
				out.println("Email: <input name='email' value='"+e.getEmail()+"' /><br/>");
				out.println("Salary: <input name='salary' value='"+e.getSalary()+"' /><br/>");
				out.println("<input type=submit>Update</input>");
				out.println("</form>");
			}
			else if(action.equals("delete")) {
				int id = Integer.parseInt(request.getParameter("id"));
				
				dao.delete(id);
				response.sendRedirect("employee");
			}
			
		}catch(Exception e) {
			out.println("Error: "+e.getMessage());
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		System.out.print("action:"+action);
		
		try {
			if(action.equals("insert")) {
				Employee e= new Employee();
				e.setName(request.getParameter("name"));
				e.setEmail(request.getParameter("email"));
				e.setSalary(Double.parseDouble(request.getParameter("salary")));
				System.out.println(e);
				dao.insert(e);
			}
			
			else if(action.equals("update")) {
				Employee e = new Employee();
				e.setId(Integer.parseInt(request.getParameter("id")));
				e.setName(request.getParameter("name"));
				e.setEmail(request.getParameter("email"));
				e.setSalary(Double.parseDouble(request.getParameter("salary")));
				
				dao.update(e);
			}
			
			response.sendRedirect("employee");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
