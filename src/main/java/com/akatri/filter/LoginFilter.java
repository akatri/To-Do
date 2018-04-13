package com.akatri.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
@WebFilter(urlPatterns="*.do")
public class LoginFilter implements Filter {

	@Override
	public void destroy() {
	
	}

	@Override
	public void doFilter(ServletRequest sreq, ServletResponse sres, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest) sreq;
		if(request.getSession().getAttribute("name")!=null) {
		chain.doFilter(sreq, sres);
		}else {
			//send to login page
			request.getRequestDispatcher("/login.do").forward(sreq, sres);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		
	}

}
