package web.filtr;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/success.jsp")
public class Access3 implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		HttpSession session = request.getSession();
		
		if(request.getParameter("city").equals(null) || "".equals(request.getParameter("city")))
		{
			response.sendRedirect("/");
			return;
		}
		if(request.getParameter("zipCode").equals(null) || "".equals(request.getParameter("zipCode")))
		{
			response.sendRedirect("/");
			return;
		}
		if(request.getParameter("houseNumber").equals(null) || "".equals(request.getParameter("houseNumber")))
		{
			response.sendRedirect("/");
			return;
		}
		if(request.getParameter("localNumber").equals(null) || "".equals(request.getParameter("localNumber")))
		{
			response.sendRedirect("/");
			return;
		}
		if(request.getParameter("phoneNumber").equals(null) || "".equals(request.getParameter("phoneNumber")))
		{
			response.sendRedirect("/");
			return;
		}
		
		if(request.getParameter("street").equals(null) || "".equals(request.getParameter("street")))
		{
			response.sendRedirect("/");
			return;
		}
		
			
		chain.doFilter(req, res);
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
