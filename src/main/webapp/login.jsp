<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <title>Implicit Object Example</title>
</head>
<body>
<form action="login.jsp" method="POST">
    <label  for="username">Username:</label>
    <input name="name" id="username" type="text">
    <label for="password">Password:</label>
    <input name="password" id="password" type="text">
    <button type="submit">Submit</button>
</form>

<%
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    if("admin".equals(name) || "password".equals(password)){
        response.sendRedirect("profile.jsp");
    } else if (name != null || password != null) {
        response.sendRedirect("login.jsp");
    }
%>


</body>
</html>
