<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css"/>	
</head>
<body>

<jsp:include page="_header.jsp"/>
<section>
	<jsp:include page="_sidebar.jsp"/>
  <article>
  		<jsp:include page="${param.content}.jsp"/>
  </article>
</section>

<jsp:include page="_footer.jsp"/>

</body>
</html>
