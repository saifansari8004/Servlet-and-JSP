package in.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String nameString=req.getParameter("name");
		String emailString=req.getParameter("email");
		String password=req.getParameter("password");
		String genderString=req.getParameter("gender");
		String cityString=req.getParameter("city");
		
		PrintWriter out=resp.getWriter();
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_profile", "root", "sa12345");
			String insert_query="INSERT INTO register VALUES(?,?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(insert_query);
			ps.setString(1,nameString);
			ps.setString(2,emailString);
			ps.setString(3,password);
			ps.setString(4,genderString);
			ps.setString(5,cityString);
			
			int cnt = ps.executeUpdate();
			if(cnt > 0)
			{
				req.setAttribute("success", "Registered Successfully");
				//System.out.println("Insert Successfully");
				RequestDispatcher rDispatcher = req.getRequestDispatcher("login.jsp");
				rDispatcher.forward(req, resp);
			}
			else
			{
				System.out.println("failed");
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			resp.setContentType("text/html");
			out.print("<h3>Error :"+e.getMessage()+"</h3></div>");
			RequestDispatcher rDispatcher = req.getRequestDispatcher("register.jsp");
			rDispatcher.include(req, resp);
		}
		
	}
}
