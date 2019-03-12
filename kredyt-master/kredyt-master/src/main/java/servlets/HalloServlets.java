package servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HalloServlets extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String name=request.getParameter("name");
		response.setContentType("text/html");
		response.getWriter().println("<h1><center>Hello "+name+"</center></h1>");
	}
	
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		
		String name=request.getParameter("name");
		if((name==null) || (name.equals("") || (name.isEmpty())))
		{
			response.sendRedirect("/");
		}
		response.setContentType("text/html");
		response.getWriter().println("<h1><center>Hello "+name+"</center></h1>");
	}

}
