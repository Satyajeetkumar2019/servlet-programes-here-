package com.nt.Servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
public class TestServlet extends HttpServlet{
	static{
	System.out.println("SB BLOCK");	
	}
	public TestServlet(){
		System.out.println("construct :");
	}
	public void init(ServletConfig cg) {
		
		System.out.println("ServletConfig cg");
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("servic(--)");
		//setcontenttype
		res.setContentType("text/html");
		//GetPritnter writer 
		PrintWriter pw=res.getWriter();
		//writer the Response 
		Date d=new Date();
		pw.println("<h5 style='color:red;text-align:center; '>Date and  Time :"+d+"</h4>");
		//close strime 
		pw.close();
	}//servic(-)
	public void destroy() {
		
		System.out.println("destroy method :");
	}//end destroy(-)

	
	
	
	
}//end class
