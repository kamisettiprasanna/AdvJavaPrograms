package com.sathya.cookie;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Cookie1Servlet")
public class Cookie1Servlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		        //Get the data
				String username = request.getParameter("Username");
				String age = request.getParameter("age");
				
				//create the cookie object
				Cookie cookie1 =new Cookie("username","username");
				Cookie cookie2 =new Cookie("age","age");
				
				//add the cookie into cookie object
				response.addCookie(cookie1);
				response.addCookie(cookie2);
				
				//place the data into session object
				RequestDispatcher dispatcher = request.getRequestDispatcher("form2.html");
				dispatcher.forward(request,response);;
			
	}

}