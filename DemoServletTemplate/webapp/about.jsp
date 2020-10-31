<%@page import="java.util.List"%>
<%@page import="com.vn.controller.Message"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    Hello ${param.name}
    
    <%= 5*6%>
    
    <%! 
    	String a = "5";
    %>
    
    <% 
    	String a = "6";
    	out.print(a);
    %>
    <% 
  	 String b =  (String)request.getAttribute("person");
    out.print(b);
    %>
    
    <% 
    List<Message> list = (List<Message>)request.getAttribute("msgList");
    out.print("<html>");
    out.print("<body>");
    out.print("<a href='http://google.com'>Google.com</a>");
    for(Message message : list){
    	  out.print("<p href='http://google.com'>"+ message.getMsg() +"</a>");
    }
    out.print("</body>");
    out.print("</html>");
    
		
		request.setAttribute("msgList", list);
    %>
</body>
</html>