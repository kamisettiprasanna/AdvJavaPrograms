package cpm.sathya.cookie;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Cookie2Servlet")
public class Cookie2Servlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Get the data
		String Qualification = request.getParameter("qualification");
		String Designation = request.getParameter("designation");
		
		//create the cookie object
		Cookie cookie3 =new Cookie("Qualification","Qualification");
		Cookie cookie4 =new Cookie("Designation","Designation");
		
		//add the cookie into cookie object
		response.addCookie(cookie3);
		response.addCookie(cookie4);
		
		//place the data into session object
		RequestDispatcher dispatcher = request.getRequestDispatcher("form3.html");
		dispatcher.forward(request,response);
	}

}