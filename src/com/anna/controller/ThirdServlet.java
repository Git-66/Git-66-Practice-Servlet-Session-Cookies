package com.anna.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet{
	
	public void init() {
		System.out.println("in init method");
	}
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("in third servlet");
		PrintWriter out = res.getWriter();
		out.println("in third servlet");
		
	}
	public void destroy() {
		System.out.println("in destroy method");
	 
 }
}
