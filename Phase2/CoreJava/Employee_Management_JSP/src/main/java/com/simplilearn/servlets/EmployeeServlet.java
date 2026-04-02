package com.simplilearn.servlets;

import java.io.IOException;

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
		
		String action = request.getParameter("action");
		
		try {
			if("delete".equals(action)) {
				int id= Integer.parseInt(request.getParameter("id"));
				EmployeeDAO.delete(id);
				response.sendRedirect("index.jsp");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Employee e = new Employee();
		e.setName(request.getParameter("name"));
		e.setEmail(request.getParameter("email"));
		e.setSalary(Double.parseDouble(request.getParameter("salary")));
		
		try {
			EmployeeDAO.insert(e);
			response.sendRedirect("index.jsp");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
