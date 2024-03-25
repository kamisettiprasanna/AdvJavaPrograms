package cpm.sathya.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookie3Servlet")
public class Cookie3Servlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // get the data
        String email = request.getParameter("Email");
        String mobile = request.getParameter("Mobile");

        // create the cookie objects
        Cookie cookie5 = new Cookie("email", email);
        Cookie cookie6 = new Cookie("mobile", mobile);

        // add the cookies to the response
        response.addCookie(cookie5);
        response.addCookie(cookie6);

        // display the cookies and form data
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        Cookie[] cookies = request.getCookies();


        writer.println("<html>");
        writer.println("<body>");
        writer.println("<pre style='color:pink'>");
        
        writer.println("User Email:"+cookies[0].getValue());
        writer.println("User Email:"+cookies[1].getValue());
        writer.println("User Email:"+cookies[2].getValue());
        writer.println("User Email:"+cookies[3].getValue());
        writer.println("User Email:"+request.getParameter("email"));
        writer.println("User Email:"+request.getParameter("mobile"));


      
        writer.println("</pre>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
