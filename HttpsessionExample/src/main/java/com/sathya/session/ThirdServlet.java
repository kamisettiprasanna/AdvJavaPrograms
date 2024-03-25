package com.sathya.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.SessionTrackingMode;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThirdServlet
 */@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data
		 String email=request.getParameter("email");
		 String phone=request.getParameter("phone");
		 //creation session object
		 HttpSession session=request.getSession(false);
		 session.setAttribute("email", email);
		 session.setAttribute("phone", phone);
		 //requested data
		 response.setContentType("text/html");
		 PrintWriter writer=response.getWriter();
		 writer.println("<html>");
		 writer.println("<body style=color:red>");
		 writer.println("<pre>");
		 writer.println("Username:"+session.getAttribute("username"));
		 writer.println("age:"+session.getAttribute("age"));
		 writer.println("qualification:"+session.getAttribute("qualification"));
		 writer.println("designition:"+session.getAttribute("designition"));
		 writer.println("email:"+session.getAttribute("email"));
		 writer.println("password:"+session.getAttribute("phone"));
		 writer.println("</pre>");
		 writer.println("</body>");
		 writer.println("</html>");
	}
}
		 
		 