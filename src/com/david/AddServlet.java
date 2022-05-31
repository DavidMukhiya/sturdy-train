package com.david;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
//		PrintWriter out = res.getWriter();
		
//		out.println("<h1>Sum is : "+k+"<h1>");
//		
//		req.setAttribute("k", k);
//		
//		RequestDispatcher rd = req.getRequestDispatcher("cube");
//		rd.forward(req, res);
		
//		res.sendRedirect("cube?k="+k);
		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
		
//		for Cookie
		
		Cookie cookie = new Cookie("k", k+""  );
		res.addCookie(cookie);
		res.sendRedirect("cube");
	
		
		
		
	}
}
