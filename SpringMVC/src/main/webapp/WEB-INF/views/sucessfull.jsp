<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${not empty create}">
			<p>Successful created ${create}</p>
		</c:when>
		<c:when test="${not empty read}">
			<h3>List:</h3>
			<c:forEach var="employee" items="${read}">
				<li>${employee}</li>
			</c:forEach>
		</c:when>
		<c:when test="${not empty one}">
			<p>The Given id:${one}</p>
		</c:when>
		<c:when test="${not empty update}">
			<p>Update successfull:${update}
		</c:when>
		<c:otherwise>
			<p>No data to display.</p>
		</c:otherwise>
	</c:choose>
</body>
</html>
