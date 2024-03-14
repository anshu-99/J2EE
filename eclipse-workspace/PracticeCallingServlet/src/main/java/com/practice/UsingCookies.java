package com.practice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/numbers")
public class UsingCookies extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int a=Integer.parseInt(req.getParameter("numA"));
		int b=Integer.parseInt(req.getParameter("numB"));
		int result=a+b;
		
		Cookie cookie = new Cookie("result",result+"");
		res.addCookie(cookie);
		res.sendRedirect("double");
	}

}
