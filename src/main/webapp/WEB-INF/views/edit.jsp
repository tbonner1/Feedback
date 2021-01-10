<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Customer</title>
</head>
<body>
      <h2>Edit Customer</h2>
      <form:form action="editemp" method="post" modelAttribute="edit">
          <table border="0" cellpadding="5">
              <tr>
                  <td>ID: </td>
                  <td>${edit.id}
                      <form:hidden path="id"/>
                  </td>
              </tr>        
              <tr>
                  <td>Name: </td>
                  <td><form:input path="name" /></td>
              </tr>
              <tr>
                  <td colspan="2"><input type="submit" value="Save"></td>
              </tr>                    
          </table>
      </form:form>
</body>
</html>