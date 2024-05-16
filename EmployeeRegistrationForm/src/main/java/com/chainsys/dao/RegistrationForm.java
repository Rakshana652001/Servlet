package com.chainsys.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.model.Employee;
import com.chainsys.model.UserArrayList;

/**
 * Servlet implementation class RegistrationForm
 */
@WebServlet("/RegistrationForm")
public class RegistrationForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Employee> list = new ArrayList<Employee>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		int phoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String rePassword = request.getParameter("rePassword");
		String city = request.getParameter("city");
		int pincode = Integer.parseInt(request.getParameter("pincode"));
		String state = request.getParameter("state");
		String nationality = request.getParameter("nationality");
		
		PrintWriter out = response.getWriter(); 		
		System.out.println("Do get");

		list.add(new Employee(id, name, dob,gender, phoneNumber, email, password, rePassword, city, pincode, state, nationality));
        request.setAttribute("list", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("table.jsp");
        dispatcher.forward(request, response);
		
	}
		
		
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
