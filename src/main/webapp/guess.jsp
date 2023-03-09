<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="partials/navbar.jsp" />
<jsp:include page="partials/head.jsp" />

<!doctype html>
<html>
<head>
    <title>Guess</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/SendGuessServlet" method="POST">
    <label for="guess">Guess Number 1-5</label>
    <input type="text" name="guess" id="guess">
    <button type="submit">Submit</button>
</form>
</body>
</html>
