package com.anna.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Student extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("student servlet");
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String marks = request.getParameter("marks");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(marks);
		
		
		PrintWriter out = response.getWriter();
		out.println("ID:"+ id);
		out.println("NAME:"+ name);
		out.println("MARKS:" + marks);
		
		
		
		
		
		
	}

}
