package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("test3")
/**
 * Servlet implementation class Practice
 */
public class Practice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	PrintWriter writer=response.getWriter();
	  writer.println("<h1>hello!");
	  writer.println("<h2>where r u dear");
	  writer.println("<h3>i am waiting ");
	}
}
		// TODO Auto-generated method stub
		