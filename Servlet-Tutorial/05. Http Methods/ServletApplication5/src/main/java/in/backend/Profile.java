package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class Profile extends HttpServlet
{
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
//	{
//		
//	}
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
//	{
//		
//	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		System.out.println("In ProfileServlet doPost() method");
		String myemail = req.getParameter("email");
		String mypass = req.getParameter("password");
				
		req.setAttribute("email", myemail);
		
		if (myemail.equals("saif@gmail.com") && mypass.equals("saif123"))
		{
			System.out.println("Login Success");
			RequestDispatcher rd =  req.getRequestDispatcher("profile.jsp");
			rd.forward(req, res);
		} 
		else 
		{
			System.out.println("Login Failed");
		}
	}
	
	
}
