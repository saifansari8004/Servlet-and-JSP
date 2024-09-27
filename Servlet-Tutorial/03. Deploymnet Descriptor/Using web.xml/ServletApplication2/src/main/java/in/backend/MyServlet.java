package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter outPrintWriter = res.getWriter();
		res.setContentType("text/html");
		outPrintWriter.println("<h1><center>Introduction to web.xml(Deployment Dispatcher)</center></h1>");
		outPrintWriter.println("Hello from MyServlet");
		System.out.println("IN service method of MyServlet");
	}
}
