package in.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out=resp.getWriter();
		String myemail=req.getParameter("email");
		String mypass=req.getParameter("password");
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_profile", "root", "sa12345");
			String select_query="SELECT * FROM register WHERE stdemail=? AND stdpass=?";
			PreparedStatement ps = con.prepareStatement(select_query);
			ps.setString(1,myemail);
			ps.setString(2, mypass);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				HttpSession session = req.getSession();
				session.setAttribute("name_key", rs.getString("stdname"));
				session.setAttribute("email_key", rs.getString("stdemail"));
				session.setAttribute("gender_key", rs.getString("gender"));
				session.setAttribute("city_key", rs.getString("city"));
				
				RequestDispatcher rDispatcher = req.getRequestDispatcher("profile.jsp");
				rDispatcher.forward(req, resp);
				
			}
			else
			{
				resp.setContentType("text/html");
				out.print("<h3 style='color=red'>Invalid Credential </h3>");
				RequestDispatcher rDispatcher = req.getRequestDispatcher("login.jsp");
				rDispatcher.include(req, resp);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			//resp.setContentType("text/html");
			//out.print("<h3>Error :"+e.getMessage()+"</h3></div>");
			RequestDispatcher rDispatcher = req.getRequestDispatcher("login.jsp");
			rDispatcher.include(req, resp);
		}
	}
}
