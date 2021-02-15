package com.anna.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("second servlet");
	}

}
