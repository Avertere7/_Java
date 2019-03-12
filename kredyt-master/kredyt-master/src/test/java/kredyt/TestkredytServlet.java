package kredyt;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

import servlets.kredytServlet;;

public class TestkredytServlet extends Mockito{
	
	@Test
	public void kwota_kredytu_jest_pusta() throws IOException{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(writer);
		
		kredytServlet servlet = new kredytServlet();
		
		when(request.getParameter("kwota")).thenReturn("");
		
		servlet.doPost(request,response);
		
		verify(response).sendRedirect("/Error.jsp");
	}
	@Test
	public void kwota_kredytu_nie_jest_liczba() throws IOException{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(writer);
		
		kredytServlet servlet = new kredytServlet();
		
		when(request.getParameter("kwota")).thenReturn("abc");
		
		servlet.doPost(request,response);
		
		verify(response).sendRedirect("/Error.jsp");
	}
	@Test
	public void Ilosc_rat_jest_pusta() throws IOException{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(writer);
		
		kredytServlet servlet = new kredytServlet();
		
		when(request.getParameter("raty")).thenReturn("");
		
		servlet.doPost(request,response);
		
		verify(response).sendRedirect("/Error.jsp");
	}
	@Test
	public void Ilosc_rat_nie_jest_liczba() throws IOException{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(writer);
		
		kredytServlet servlet = new kredytServlet();
		
		when(request.getParameter("raty")).thenReturn("abc");
		
		servlet.doPost(request,response);
		
		verify(response).sendRedirect("/Error.jsp");
	}
	
	@Test
	public void Oprocentowanie_jest_puste() throws IOException{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(writer);
		
		kredytServlet servlet = new kredytServlet();
		
		when(request.getParameter("proc")).thenReturn("");
		
		servlet.doPost(request,response);
		
		verify(response).sendRedirect("/Error.jsp");
	}
	@Test
	public void Oprocentowanie_nie_jest_liczba() throws IOException{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(writer);
		
		kredytServlet servlet = new kredytServlet();
		
		when(request.getParameter("proc")).thenReturn("abc");
		
		servlet.doPost(request,response);
		
		verify(response).sendRedirect("/Error.jsp");
	}
	
	
	@Test
	public void Oplata_stala_jest_pusta() throws IOException{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(writer);
		
		kredytServlet servlet = new kredytServlet();
		
		when(request.getParameter("oplata")).thenReturn("");
		
		servlet.doPost(request,response);
		
		verify(response).sendRedirect("/Error.jsp");
	}
	@Test
	public void Oplata_stala_nie_jest_liczba() throws IOException{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(writer);
		
		kredytServlet servlet = new kredytServlet();
		
		when(request.getParameter("oplata")).thenReturn("abc");
		
		servlet.doPost(request,response);
		
		verify(response).sendRedirect("/Error.jsp");
	}
	
	@Test
	public void rodzaj_jest_pusty() throws IOException{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(writer);
		
		kredytServlet servlet = new kredytServlet();
		
		when(request.getParameter("rodzaj")).thenReturn("");
		
		servlet.doPost(request,response);
		
		verify(response).sendRedirect("/Error.jsp");
	}
	
	@Test
	public void wszystko_dobrze() throws IOException{
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		PrintWriter writer = mock(PrintWriter.class);
		when(response.getWriter()).thenReturn(writer);
		
		kredytServlet servlet = new kredytServlet();
		
		when(request.getParameter("kwota")).thenReturn("200000");
		when(request.getParameter("raty")).thenReturn("30");
		when(request.getParameter("proc")).thenReturn("25");
		when(request.getParameter("oplata")).thenReturn("100");
		when(request.getParameter("rodzaj")).thenReturn("stala");
		
		servlet.doPost(request,response);
		
		
	}

}
