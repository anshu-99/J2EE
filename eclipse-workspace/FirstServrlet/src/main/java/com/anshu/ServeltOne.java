package com.anshu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class ServeltOne extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		String opt = req.getParameter("opt");

		if (opt.equals("add")) {
			out.println("Answer: " + (a + b));
		} else if (opt.equals("sub")) {
			out.println("Answer: " + (a - b));
		} else if (opt.equals("mul")) {
			out.println("Answer: " + (a * b));
		} else if (opt.equals("div")) {
			out.println("Answer: " + (a / b));
		} else {
			out.println("Invalid Input");
		}
	}

		public static long factorial(int n) {
			if(n==0 || n==1) {
				return 1;
			} else {
				return n * factorial(n-1);
			}
		}
		@Override
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			// TODO Auto-generated method stub
			int a = Integer.parseInt(req.getParameter("num"));
			long ans = factorial(a);
			PrintWriter out = res.getWriter();
			out.println("Answer:"+ans);
		}
	}

