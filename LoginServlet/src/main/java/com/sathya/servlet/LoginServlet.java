package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.Read data from client
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		//process the data
		String status;
		if(username.equals("prasanna")&&password.equals("sai@123")) {
			status="login successful";
		}
		else
			
		{
			status="login failed";
		}
		//render response to client
		 PrintWriter writer=response.getWriter();
		 response.setContentType("text/html");
		 writer.println("<html>");
		 writer.println("<h1>login status:</h1>"+status);
		 writer.println("</html>");
	}
}
		