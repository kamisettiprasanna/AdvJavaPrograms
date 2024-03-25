package com.sathya.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//get the data from client
		String uname=request.getParameter("uname");
		int age=Integer.parseInt(request.getParameter("age"));
		
		//create session object
		HttpSession session=request.getSession();
		session.setAttribute("uname",uname);
		session.setAttribute("age", age);
	RequestDispatcher dispatcher=request.getRequestDispatcher("form1.html");
	dispatcher.forward(request, response);
	}
}
		
		
		