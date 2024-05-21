package com.chainsys.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.DemoImplementation;
import com.chainsys.model.Demo;

/**
 * Servlet implementation class DemoServlet1
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Demo demo = new Demo();
	DemoImplementation demoImplementation = new DemoImplementation();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Do get");
		
		String name = request.getParameter("name");
		demo.setName(name);
		String emailID = request.getParameter("emailID");
		demo.setEmailID(emailID);
		String phoneNumber = request.getParameter("phoneNumber");
		demo.setPhoneNumber(phoneNumber);
		
		try {
			PrintWriter out = response.getWriter();
			out.println(demo.getName()+"Inserted");
			out.println(demo.getEmailID());
			out.println(demo.getPhoneNumber());
			demoImplementation.saveDetails(demo);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("Do Post");
	}

}
