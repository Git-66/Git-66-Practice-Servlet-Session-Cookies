package com.anna.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookie extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) {
		
		Cookie ck1=new Cookie("name","Anna");
		Cookie ck2=new Cookie("salary","15k");
		System.out.println("in cookie class");
		
		res.addCookie(ck1);
		res.addCookie(ck2);
		
	}
}
