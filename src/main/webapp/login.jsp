<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="partials/navbar.jsp" />
<jsp:include page="partials/head.jsp" />

<!doctype html>
<html>
<head>
    <title>Implicit Object Example</title>
</head>
<body>
<%--<form action="login.jsp" method="POST">--%>
<%--    <label  for="username">Username:</label>--%>
<%--    <input name="name" id="username" type="text">--%>
<%--    <label for="password">Password:</label>--%>
<%--    <input name="password" id="password" type="text">--%>
<%--    <button type="submit">Submit</button>--%>
<%--</form>--%>
<div class="card border-dark mb-3 d-flex mx-auto mt-5" style="max-width: 40rem; ">
    <div class="card-header">Login</div>
    <div class="card-body text-dark">
        <form action="login.jsp" method="POST">
            <div class="mb-3">
                <label for="exampleInputName1" class="form-label">Username</label>
                <input name="name" type="text" class="form-control" id="exampleInputName1">
                <div id="userHelp" class="form-text">We'll never share your user with anyone else.</div>
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Password</label>
                <input name="password" type="password" class="form-control" id="exampleInputPassword1">
            </div>
            <div class="mb-3 form-check">
                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                <label class="form-check-label" for="exampleCheck1">Check me out</label>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</div>


<%
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    if("admin".equals(name) && "password".equals(password)){
        response.sendRedirect("profile.jsp");
    } else if (name != null || password != null) {
        response.sendRedirect("login.jsp");
    }
%>


</body>
</html>
