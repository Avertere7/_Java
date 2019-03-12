package servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static java.lang.Math.*;

@WebServlet("/kredyt")
public class kredytServlet  extends HttpServlet {


	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		
		float raty = 0,proc = 0,kwota = 0,oplata = 0,calosc=0;
		
		float RK=0,RO=0,Szi;
		String kwotaS=request.getParameter("kwota");
		String ratyS=request.getParameter("raty");
		String procS=request.getParameter("proc");
		String oplataS=request.getParameter("oplata");
		String rodzaj=request.getParameter("rodzaj");
		
		
		try {
		    kwota = Float.parseFloat(kwotaS);
		    raty = Float.parseFloat(ratyS);
		    proc= Float.parseFloat(procS);
		    if((proc>100 || proc <0))
			{
				response.sendRedirect("/Error.jsp");
			}
		    oplata = Float.parseFloat(oplataS);
		    RK=kwota/raty;
			
			
			

		    
		} catch (NumberFormatException e) {
		    response.sendRedirect("/Error.jsp");
		}
		
		
				
		
		if(rodzaj!=null)
		{
			response.setContentType("text/html");
			response.getWriter().print("<center><table border=1>"
					+ "<tr><th>Nr Raty</th><th>Kwota Kapitalu</th><th>Kwota odsetek</th><th>Oplaty stale</th><th>Calkowita kwota raty</th></tr>");
			if("stala".equals(rodzaj))
			{
				RO=((proc/100)*(30/360));
				for(int x=0;x<raty;x++)
				{
					
					Szi=RK*(1+(raty-x+1)*(RO));
					response.getWriter().print("<tr><th>"+(x+1)+"</th><th>"+(kwota-(RK*x))+"</th><th>"+Szi +"</th><th>"+oplata+"</th><th>"+(Szi+oplata)+"</th></tr>");
				}
			}
			else
			{
				RO=(((proc)/100)/12)+1;
				
				for(int x=0;x<raty;x++)
				{
					
					Szi=(float) (kwota*((pow(RO,raty)-(pow(RO,(x-1))))/((pow(RO,raty)-1))*proc/(100*12)));
					
					response.getWriter().print("<tr><th>"+(x+1)+"</th><th>"+(kwota/raty)+"</th><th>"+Math.round(Szi * 100.0) / 100.0+"</th><th>"+oplata+"</th><th>"+Math.round((Szi+oplata+(kwota/raty)) * 100.0) / 100.0+"</th></tr>");
				}
			}
		}
		else
		{
			response.sendRedirect("/");
		}
	
		
		
		
		
		response.getWriter().print(
				"</table>"
				+ "</center>");
	}

}
