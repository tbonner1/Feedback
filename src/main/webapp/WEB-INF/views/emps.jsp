<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Employees</title>
</head>
<h1 >List of Employees</h1>
<body>
	<ul>
		<c:forEach items="${employees}" var="emps">
			<li>${emps.id} : ${emps.name}</li>
		</c:forEach>
	</ul>
</body>
</html>