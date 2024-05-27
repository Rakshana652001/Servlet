package com.chainsys.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.dao.DemoImplementation;
import com.chainsys.model.Demo;

/**
 * Servlet implementation class DemoServlet1
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DemoImplementation demoImplementation = new DemoImplementation();
	List<Demo> list = new ArrayList<Demo>(); 
	Demo demo = new Demo();

       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Do get");		
		
//		String name = request.getParameter("name");
//		demo.setName(name);
//		String emailID = request.getParameter("emailID");
//		demo.setEmailID(emailID);
//		String phoneNumber = request.getParameter("phoneNumber");
//		demo.setPhoneNumber(phoneNumber);
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		if(session!=null)
		{
			String name = request.getParameter("name");
			demo.setName(name);
			String emailID = request.getParameter("emailID");
			demo.setEmailID(emailID);
			String phoneNumber = request.getParameter("phoneNumber");
			demo.setPhoneNumber(phoneNumber);
			
			
			out.println(demo.getName()+"Inserted");
			out.println(demo.getEmailID());
			out.println(demo.getPhoneNumber());
			
			try
			{
				demoImplementation.saveDetails(demo);
			}
	        catch(Exception e)
			{
	        	System.out.println(e);
			}
			retrive(request,response);
			
		}
		else
		{
			response.sendRedirect("Login.jsp");
		}
		out.print("<a href='Login.jsp'>Back to home</a>");
		
	}

	
	protected void retrive(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		try 
		{
			
			List<Demo> list = demoImplementation.retriveDetails(demo);

	        request.setAttribute("list", list);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("DemoTable.jsp");
	        dispatcher.forward(request, response);
	        System.out.println(list);			
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
		
		System.out.println("Do Post");
		String delete = request.getParameter("delete");
        if(delete != null && delete.equals("Delete"))
        {
            String name=request.getParameter("deleteName");
            demo.setName(name);
            try 
            {
                demoImplementation.deleteDetails(demo);
                System.out.println("Row deleted");

                List<Demo> list = demoImplementation.retriveDetails(demo);
                System.out.println("Displayed successfully..");
                request.setAttribute("list", list);
                request.getRequestDispatcher("DemoTable.jsp").forward(request, response);
            } 
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

	}}
