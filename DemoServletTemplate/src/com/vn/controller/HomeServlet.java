//package com.vn.controller;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/")
//public class HomeServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String viewHome = "home";
//		String viewName = request.getParameter("view");
//		if(viewName == null) {
//			viewName = viewHome;
//		} else {
//			//..
//		}
//		request.setAttribute("view", viewName);
//		request.getRequestDispatcher("index.jsp").forward(request, response);
//	}
//
//}
