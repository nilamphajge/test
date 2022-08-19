package com.servlet;
import java.io.IOException;

import javax.servlet.*;

public class firstServlet implements Servlet {

	ServletConfig conf;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("going to destroy servlet object");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "this servlet created by Nilam";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		this.conf= conf;
		System.out.println("creating object.....");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("servcing....");
		System.out.println("ok");
		System.out.println("ok");
		System.out.println("ok");
		
	}

	
}
