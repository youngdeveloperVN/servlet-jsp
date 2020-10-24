<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	td, th, tr {
		border: solid 1px black;
	}
</style>
</head>
<body>

	<table>
		<thead>
			<tr>
	<!-- 			ctrl + alt + down -->
				<th>No.</th>
				<th>Id</th>
				<th>Name</th>
				<th>Price</th>
				<th>Action</th>
			</tr>
		<thead>
		
		<tbody>
		<c:forEach var="element"  items="${list}" varStatus="status">
			<tr>
				<td><c:out value="${status.count}"/></td>
				<td><c:out value="${element.id}"/></td>
				<td><c:out value="${element.name}"/></td>
				<td><c:out value="${element.price}"/></td>
				<td><a href="#">Edit</a> <a href="#">Delete</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>

</body>
</html>