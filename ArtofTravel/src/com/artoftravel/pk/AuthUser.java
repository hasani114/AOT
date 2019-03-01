package com.artoftravel.pk;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.*;

/**
 * Servlet Filter implementation class AuthUser
 */
@WebFilter(filterName="/AuthUser", urlPatterns= { "/Admin/*", "/reserve.jsp", "/Users/*"})

public class AuthUser implements Filter {


    public AuthUser() {
        // TODO Auto-generated constructor stub
    }


	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;


		HttpSession session = req.getSession(false);
		Object userid=  session.getAttribute("UserID");
		
		
		// Get redirect URL to set as parameter
		String redirectURL = req.getRequestURI();
		
		String encoded = res.encodeUrl(redirectURL);
		
		//If session is null send to login page with redirect URL
		
		if (userid == null) {
			
			res.sendRedirect("/ArtofTravel/Login.jsp?redirect=" + redirectURL);
			
		} else { System.out.println("Successful Login");
			
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}
		
		

	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
