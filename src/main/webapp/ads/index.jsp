<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>
<h1>Here are all the ads!</h1>
<c:forEach var="ad" items="${ads}">
    <h2>"${ad.title}"</h2>
    <p>By: ${ad.description}</p>
</c:forEach>
</body>
</html>
