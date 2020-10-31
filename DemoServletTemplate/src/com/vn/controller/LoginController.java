package com.vn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vn.entities.User;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get parram
		String uName = req.getParameter("username");
		String uPass = req.getParameter("password");
		
		User user = new User();
		user.setPassword(uPass);
		user.setUsername(uName);
		//check username password
		if(uName.equals("addmin") && uPass.equals("addmin")) {
			req.getSession().setAttribute("userLogged", user);
			resp.sendRedirect(req.getContextPath());
		} else {
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}

}
