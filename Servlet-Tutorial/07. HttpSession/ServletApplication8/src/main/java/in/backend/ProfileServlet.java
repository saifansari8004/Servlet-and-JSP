package in.backend;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/myprofile")
public class ProfileServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String nameString = req.getParameter("name");
		String prnString = req.getParameter("prn");
		String emailString = req.getParameter("email");
		String addressString = req.getParameter("address");
		String colleString = req.getParameter("college");
		
		HttpSession session=req.getSession();
		
		
		session.setAttribute("name_key", nameString);
		session.setAttribute("prn_key", prnString);
		session.setAttribute("email_key", emailString);
		session.setAttribute("address_key", addressString);
		session.setAttribute("college_key", colleString);
		
		
		System.out.println("In doPost() method of ProfileServlet");
		
		RequestDispatcher rdDispatcher = req.getRequestDispatcher("profile.jsp");
		rdDispatcher.forward(req, resp);
		
	}
}
