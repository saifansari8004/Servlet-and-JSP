package in.backend;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
			System.out.println("Enter");
			HttpSession session = req.getSession();
			session.invalidate();
			RequestDispatcher dispatcher=req.getRequestDispatcher("index.jsp");
			dispatcher.forward(req, resp);
			System.out.println("Exit");
	}
}
