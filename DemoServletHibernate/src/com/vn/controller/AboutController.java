package com.vn.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/about")
public class AboutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet.....");
		request.setAttribute("person", "Tung");
		//dao.getAll list
		List<Message> list =new ArrayList<Message>();
		list.add(new Message("hELLO"));
		list.add(new Message("hELLO"));
		list.add(new Message("hELLO"));
		
		request.setAttribute("msgList", list);
		request.getRequestDispatcher("about.jsp").forward(request, response);
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init.....");
		super.init();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plan");
		resp.setContentLength(6);
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html>");
		printWriter.write("<body>");
		printWriter.write("<a href='http://google.com'>Google.com</a>");
		printWriter.write("</body>");
		printWriter.write("</html>");
//		request.getRequestDispatcher("about.jsp").forward(request, response);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service.....");
		super.service(req, resp);
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy.....");
		super.destroy();
	}

}
