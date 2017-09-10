package com.shivam.learn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class ServletSessionEx extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("Session servlet GET called");
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession(); //session object one per user/machine. Can be shared among different servlets. There will be one session per user/machine.
		if (userName != null && !userName.isEmpty()) {
			session.setAttribute("savedUserName", userName);
		}
		
		PrintWriter writer = response.getWriter();
		writer.println("Username : " + userName + " ,Saved username in session: " + session.getAttribute("savedUserName"));
		
	}

}
