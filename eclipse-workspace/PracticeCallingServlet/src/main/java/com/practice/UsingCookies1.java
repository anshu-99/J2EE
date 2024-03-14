package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/double")
public class UsingCookies1 extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie cookies[] = req.getCookies();
		int result=0;
		for(Cookie c: cookies) {
			if(c.getName().equals("result")) {
				result=Integer.parseInt(c.getValue());
			}
			
		}
		result=2*result;
		PrintWriter out = res.getWriter();
		out.println("Answer:"+result);
	}
}
