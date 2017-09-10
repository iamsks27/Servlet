package com.shivam.learn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet configured using web.xml (deployment descriptor)
 * 
 * @author shivam
 *
 */
public class XmlServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Xml servlet GET called");
		String userName = request.getParameter("userName");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.print("Hello " + userName);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("Xml servlet POST called");
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		String prof = request.getParameter("prof");
		PrintWriter writer = response.getWriter();
		//request.getParameterValues can be used to get multiple values from the form.
		writer.println("username :  " + userName);
		writer.println("full name : " + fullName);
		writer.println("profession : " + prof);
	}
	
}
