package in.backend;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/mylogin")
public class LoginServelt extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		HttpSession session=req.getSession();
		String nameString = (String)session.getAttribute("name_key");
		//session.removeAttribute("name_key");
		if(nameString !=null)	
		{
			System.out.println(nameString);
			session.invalidate();
			System.out.println("Session object destroyed");
		}
		
		
		System.out.println("In service() method of LoginServlet");
		
		RequestDispatcher rd = req.getRequestDispatcher("login.html");
		rd.forward(req, resp);
		
	}
}
