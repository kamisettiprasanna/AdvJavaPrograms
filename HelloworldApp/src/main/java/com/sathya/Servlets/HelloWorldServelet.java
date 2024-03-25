package com.sathya.Servlets;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test2")

/**
 * Servlet implementation class HelloWorldServelet
 */
public class HelloWorldServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<h1> welcome to advance java</h1>");
		writer.println("<h2>Ratan sir teaching very interesting</h2>");
		writer.println("<h3>in my own space i am perfect<h3>");
	}
}
