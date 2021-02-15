package com.anna.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterEaxample implements Filter{
	
	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filter)
			throws IOException, ServletException {
		System.out.println("before filter ");
		filter.doFilter(req, res);
		System.out.println("after filter"); 
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		
	}
	

}
