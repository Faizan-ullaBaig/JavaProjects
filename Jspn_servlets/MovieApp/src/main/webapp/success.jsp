<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String username=(String)session.getAttribute("username");
out.print("Welcome "+username);
%>
<form action="MovieServlet">
Category<select name="category" id="category">
  <option value="Comedy">Comedy</option>
  <option value="Horror">Horror</option>
  <option value="Scifi">Scifi</option>
  <option value="Action">Action</option>

</select>
<input type="submit" value="submit">
  </form>
</body>
</html>