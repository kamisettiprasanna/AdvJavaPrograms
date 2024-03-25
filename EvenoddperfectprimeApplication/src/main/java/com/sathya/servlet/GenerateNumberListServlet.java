package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GenerateNumberListServlet
 */
@WebServlet("/GenerateNumberListServlet")
public class GenerateNumberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the data
	int startNumber= Integer.parseInt(request.getParameter("Start Number"));
	int endNumber= Integer.parseInt(request.getParameter("End Number"));
	String operation=request.getParameter("operation");
		//process the data
	int result=0;
	int count=0;
	 
	 response.setContentType("text/html");
     PrintWriter writer = response.getWriter();
     writer.println("<html>");
     writer.println("<head>");
     writer.println("<title>calculations</title>");
     writer.println("</head>");
     writer.println("<body bgcolor=sky-blue>");
     
     // Define the range of even numbers
    
int counnt=0;
     
     
     switch(operation) {
     
     case "even":
    	 
     for (int i = startNumber; i <= endNumber; i++) {
         if (i % 2 == 0) {
        	 writer.print("<p> even Numbers result is:"+ i + "</p>");
             
         }
     }
     break;
     case "odd":
    	 for (int i = startNumber; i <= endNumber; i++) {
             if (i % 2 != 0) {
                 writer.print("<p> odd Numbers result is:"+ i + "</p>");
             }
    	 }
    	 break;
    	 
     
    case "prime":
    	 
    	 for (int i = startNumber; i <= endNumber; i++) {
             if (i > 1) {
                 boolean isPrime = true;
                 for (int j = 2; j <= Math.sqrt(i); j++) {
                     if (i % j == 0) {
                         isPrime = false;
                         break;
                     }
                 }
                 if (isPrime) {
                     writer.println("<p>Prime Numbers resulrt is:"+i+"</p>");
                 }
             }
         }
    	 break;
    	 
    case "strong":
    	  
    	for(int i=startNumber;i<=endNumber;i++)
    	{
    		
                int originalNum = i;
                int sum = 0;
                int temp = i;
                
                while (temp > 0) {
                    int lastdigit = temp % 10;
                    int fact = 1;
                    for (int j = 1; j <= lastdigit; j++) {
                        fact=fact*j;
                    }
                    sum = sum+fact;
                    temp=temp/ 10;
                }
                
                if (sum == originalNum) {
                    writer.println("<p>Strong Numbers result is"+originalNum + "</p>");
                }
            }
    	
     break;
    case "Armstrong":
    	for(int i=startNumber;i<=endNumber;i++)
    	{
    		
    	
    	int temp1=i;
    	int temp2;
    	int rem=0;
    	int sum=0;
    	int x,y;
    	while(temp1>0)
    	{
    	temp1=temp1/10;
    	count++;
    	
    	temp2=i;
    	while(temp2>0)
    	{
    	rem=temp2%10;
    	x=1;y=count;
    	while(y>0)
    	{
    	x=x*rem;
    	y--;
    	}
    	sum=sum+x;
    	temp2=temp2/10;
    	}}
    	if(i==sum)
    	{
    		writer.println("<p> armstrong numbers are :"+i+"</p>");
    	}
    	}
    	break;
    	}
     
     writer.println("</body>");
     writer.println("</html>");
     
     }
	}
