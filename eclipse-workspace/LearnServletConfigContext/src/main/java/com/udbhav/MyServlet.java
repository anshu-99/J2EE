package com.udbhav;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		PrintWriter out = res.getWriter();

		ServletContext cntxt=getServletContext();
		String name=cntxt.getInitParameter("Name");
		out.println("Hi "+name);

		ServletConfig cnfg=getServletConfig();
		String naam=cnfg.getInitParameter("name");
		out.println("Hello "+naam);
	}
}
