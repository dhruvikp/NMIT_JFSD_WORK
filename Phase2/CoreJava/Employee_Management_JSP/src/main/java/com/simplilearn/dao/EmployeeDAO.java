package com.simplilearn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.simplilearn.model.Employee;
import com.simplilearn.util.DBUtil;

public class EmployeeDAO {

	public static void insert(Employee e) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.getConnection();
		
		PreparedStatement ps = con.prepareStatement("INSERT INTO employee(name, email, salary) VALUES (?,?,?)");
		
		ps.setString(1, e.getName());
		ps.setString(2, e.getEmail());
		ps.setDouble(3, e.getSalary());
		
		ps.executeUpdate();
	}
	
	public static List<Employee> getAll() throws ClassNotFoundException, SQLException {
		
		List<Employee> list = new ArrayList<>();
		
		Connection con = DBUtil.getConnection();
		
		Statement st = con.createStatement();
		ResultSet rs =  st.executeQuery("SELECT * FROM employee");
		
		while(rs.next()) {
			Employee e = new Employee();
			e.setId(rs.getInt("id"));
			e.setName(rs.getString("name"));
			e.setEmail(rs.getString("email"));
			e.setSalary(rs.getDouble("salary"));
			
			list.add(e);
		}
		return list;
	}
	
	public static Employee getById(int id) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM employee where id=?");
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			Employee e = new Employee();
			e.setId(rs.getInt("id"));
			e.setName(rs.getString("name"));
			e.setEmail(rs.getString("email"));
			e.setSalary(rs.getDouble("salary"));
			return e;
		}
		return null;
	}
	
	public void update(Employee e) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.getConnection();
		
		PreparedStatement ps = con.prepareStatement("UPDATE employee SET name=?, email=?, salary=? where id=?");
		ps.setString(1, e.getName());
		ps.setString(2, e.getEmail());
		ps.setDouble(3, e.getSalary());
		ps.setInt(4, e.getId());
		
		ps.executeUpdate();
	}
	
	public static void delete(int id) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.getConnection();
		
		PreparedStatement ps = con.prepareStatement("DELETE FROM employee where id=?");
		
		ps.setInt(1, id);
		ps.executeUpdate();
	}
	
}
