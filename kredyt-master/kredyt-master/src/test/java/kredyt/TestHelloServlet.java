package kredyt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

import servlets.HalloServlets;

public class TestHelloServlet extends Mockito {
	@Test
	public void servlet_should_not_greet_the_user_if_the_name_is_null() throws IOException{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(writer);
		
		HalloServlets servlet = new HalloServlets();
		
		when(request.getParameter("name")).thenReturn(null);
		
		servlet.doPost(request,response);
		
		verify(response).sendRedirect("/");
	}
	
	@Test
	public void servlet_should_not_greet_the_user_if_the_name_is_empty() throws IOException{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(writer);
		
		HalloServlets servlet = new HalloServlets();
		
		when(request.getParameter("name")).thenReturn("");
		
		servlet.doPost(request,response);
		
		verify(response).sendRedirect("/");
	}
	
	@Test
	public void servlet_greet_the_user_when_name_is_good() throws IOException{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		
		when(request.getParameter("name")).thenReturn("jan");
		when(response.getWriter()).thenReturn(writer);
		
		
			new HalloServlets().doPost(request,response);
		
		verify(writer).println("<h1><center>Hello jan</center></h1>");
		
	}
	
	
	
	

}
