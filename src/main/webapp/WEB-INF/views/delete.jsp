<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta charset="ISO-8859-1">
<title>Delete User</title>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Customer</title>
</head>
<body>
        <h2>Delete Employee</h2>
        <form:form action="delete" method="post" modelAttribute="delete">
            <table border="0" cellpadding="5">
                <tr>
                    <td>ID: </td>
                    <td>${delete.id}
                    </td>
                </tr>        
                <tr>
                    <td>Name: </td>
                    <td>${delete.name}
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Delete"></td>
                </tr>                    
            </table>
		</form:form>
</body>
</html>