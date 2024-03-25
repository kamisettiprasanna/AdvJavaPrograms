package com.sathya.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.StreamPrintServiceFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FullNameServlet
 */
@WebServlet("/FullNameServlet")
public class FullNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read data from client
		String firstname=request.getParameter("firstname" );
		String middlename=request.getParameter("middlename");
		String lastname=request.getParameter("lastname");
		//process data
		PrintWriter writer=response.getWriter();
		 response.setContentType("text/html");
		 writer.println("<html>");
		 writer.println("<h1>fullname:</h1>"+firstname+" "+middlename+" "+lastname);
		 writer.println("</html>");
	}
}
		
