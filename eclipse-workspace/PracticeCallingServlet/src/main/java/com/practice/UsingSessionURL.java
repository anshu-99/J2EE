package com.practice;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/multiply")
public class UsingSessionURL extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int num_A = Integer.parseInt(req.getParameter("num"));
        int num_B = Integer.parseInt(req.getParameter("num1"));
        int ans = num_A * num_B;

        // Set the 'ans' attribute in the session
        HttpSession session = req.getSession();
        session.setAttribute("ans", ans);

        // Forward the request to the next servlet
        RequestDispatcher rd = req.getRequestDispatcher("cube");
        rd.forward(req, res);
    }
}
