package in.backend;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("In Profile Servlet");
		String nameString = request.getParameter("name");
		String prnString = request.getParameter("prn");
		String emailString = request.getParameter("email");
		String addressString = request.getParameter("address");
		String collegeString = request.getParameter("college");
		
		System.out.println("Name :"+nameString);
		System.out.println("PRN :"+prnString);
		System.out.println("Email :"+emailString);
		System.out.println("Address :"+addressString);
		System.out.println("College :"+collegeString);
		
		request.setAttribute("name", nameString);
	    request.setAttribute("prn", prnString);
	    request.setAttribute("email", emailString);
	    request.setAttribute("address", addressString);
	    request.setAttribute("college", collegeString);
	    
	    // Forward to profile.jsp
	    RequestDispatcher dispatcher = request.getRequestDispatcher("JSPprofile.jsp");
	    dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
}
