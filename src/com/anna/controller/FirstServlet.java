package com.anna.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet { 
	
	public void service(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		
		System.out.println("in first servlet");
		PrintWriter out = res.getWriter();
		out.println("in first servlet");
	}
	

}
