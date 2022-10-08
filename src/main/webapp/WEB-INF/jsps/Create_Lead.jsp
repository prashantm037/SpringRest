<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="SaveLead" method="post">
<table>
<tr>
<th>FirstName</th>
<th><input type="text" name="firstName"/></th>
</tr>
<tr>
<th>LastName</th>
<th><input type="text" name="lastName"/></th>
</tr>
<tr>
<th>Email</th>
<th><input type="text" name="email"/></th>
</tr>
<tr>
<th>Mobile</th>
<th><input type="text" name="mobile"/></th>
</tr>
<tr>
<th><input type="submit" value="save"/></th>
</tr>
</table>
</form>

${msg}
</body>
</html>