package com.saurabh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class post_method extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
    	System.out.println("DoPost is initialised");
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		String sname = req.getParameter("uname");
		int age = Integer.parseInt(req.getParameter("age"));
		out.print("By Post Method");
		out.print("<html><body>");
		
		out.print("<h3><b>Your Name is :" + sname+"</b></h3>");
		out.print("<h3><b>Your Age is :" + age +"</b></h3>");
		
		
		out.print("</body></html>");
	}

	public void destroy() {
		System.out.println("DoPost is destroyed");
	}


}
