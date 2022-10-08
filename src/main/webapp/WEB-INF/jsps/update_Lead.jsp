<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Update Lead</h2>
<form action="updateLead" method="post">
<table>
<tr>
<th><input type="hidden" name="id"  value="${lead.id}"/></th>
</tr>
<tr>
<th>FirstName</th>
<th><input type="text" name="firstName" value="${lead.firstName}"/></th>
</tr>
<tr>
<th>LastName</th>
<th><input type="text" name="lastName" value="${lead.lastName}"/></th>
</tr>
<tr>
<th>Email</th>
<th><input type="text" name="email" value="${lead.email}"/></th>
</tr>
<tr>
<th>Mobile</th>
<th><input type="text" name="mobile" value="${lead.mobile}"/></th>
</tr>
<tr>
<th><input type="submit" value="update"/></th>
</tr>
</table>
</form>

${msg}
</body>
</html>