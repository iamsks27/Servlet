package com.shivam.learn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet Example", urlPatterns = { "/SimpleServletPath" }, initParams={@WebInitParam(name="defaultUser", value="John Snow")})
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
        

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("Get method called");
		PrintWriter writer = response.getWriter();
		writer.println(getServletConfig().getInitParameter("defaultUser")); //init param is per servlet configuration.
	}

}
