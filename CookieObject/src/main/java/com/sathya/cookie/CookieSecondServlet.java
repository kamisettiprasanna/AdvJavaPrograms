package com.sathya.cookie;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieSecondServlet
 */
public class CookieSecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		//get the requested form data
		 String qualification=request.getParameter("qualification");
		 String designition=request.getParameter("designition");
		 //create cookie object
		 Cookie cookie3=new Cookie("qualification","qualification");
		 Cookie cookie4=new Cookie("designition","designition");
		 //add cookie into response object
		 response.addCookie(cookie3);
		 response.addCookie(cookie4);
		 RequestDispatcher dispatcher=request.getRequestDispatcher("form3.html");
		 dispatcher.forward(request, response);
		 }
		
	}