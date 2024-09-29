package in.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/index")
public class Index extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		req.getParameter("name");//define above
		
		req.setAttribute("myname", "Hello from req object");
		
		HttpSession session = req.getSession();
		session.setAttribute("myattribute","Hello from session object");
		
		resp.sendRedirect("index.jsp");
	}
}
