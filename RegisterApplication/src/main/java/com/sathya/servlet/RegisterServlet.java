package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the requested data from cclient
		String UserName=request.getParameter("UserName");
		String UserPassword=request.getParameter("UserPassword");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String DOB=request.getParameter("DOB");
		String[] qualification=request.getParameterValues("qualification");
		String Country=request.getParameter("Country");
		String[] Languages=request.getParameterValues("Languages");
		 String comments=request.getParameter("comments");
		 //process the data
		 /*here we need to convert string array to string because string response object does not suport string array
		  *  for converting string array to string we have join method
		  */
		 String l=String.join(",", Languages);
		 String q=String.join(",", qualification);
		 //render response
		 PrintWriter writer=response.getWriter();
		 response.setContentType("text/html");
		 writer.println("<html>");
		 writer.println("<body bgcolor=skyblue>");
		 writer.println("<h1>Registerd Application</h1>");
		 writer.println("<p>UserName:"+UserName+"</p>");
		 writer.println("<p>UserPassword:"+UserPassword+"</p>");
		 writer.println("<p>email:"+email+"</p>");
		 writer.println("<p>gender:"+gender+"</p>");
		 writer.println("<p>DOB:"+DOB+"</p>");
		 writer.println("<p>qualification:"+q+"</p>");
		 writer.println("<p>country:"+Country+"</p>");
		 writer.println("<p>Languages:"+l+"</p>");
		 writer.println("<p>Comments:"+comments+"</p>");
		 writer.println("</body>");
		writer.println("</html>");
	}
}	 
		