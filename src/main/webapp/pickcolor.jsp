<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="partials/navbar.jsp" />
<jsp:include page="partials/head.jsp" />

<!doctype html>
<html>
<head>
  <title>pickcolor</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/pickcolor" method="POST">
  <label for="color">Choose Crust Type</label>
  <input type="text" name="color" id="color">
  <button type="submit">Submit</button>
</form>
</body>
</html>
