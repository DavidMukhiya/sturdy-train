package com.david;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CubeServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
//		
//		int k = (int) req.getAttribute("k");
//		
//		k = k*k*k;
//		
//		out.println("cube is : "+k);
		
		int k = Integer.parseInt(req.getParameter("k"));
		k = k*k*k;
		out.println("cube is : "+k);
		
	
		
	}
}
