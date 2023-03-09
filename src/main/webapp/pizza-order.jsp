<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="partials/navbar.jsp" />
<jsp:include page="partials/head.jsp" />

<!doctype html>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/pizzatime" method="POST">
        <label for="crust">Choose Crust Type</label>
        <select name="crust" id="crust">
            <option value="regular">Regular</option>
            <option value="thin">Thin</option>
            <option value="thick">Thick</option>
        </select>
        <hr>
        <label for="sauce">Choose Crust Type</label>
        <select name="sauce" id="sauce">
            <option value="red">Red</option>
            <option value="white">White</option>
            <option value="buffalo">Buffalo</option>
            <option value="bbq">BBQ</option>
        </select>
        <hr>
        <label for="size">Choose Crust Type</label>
        <select name="size" id="size">
            <option value="personal">Personal 8"</option>
            <option value="medium">Medium 12"</option>
            <option value="large">Large 16"</option>
        </select>
        <hr>
        <input type="checkbox" id="pep" name="pep" value="pep">
        <label for="pep"> Pepperoni</label><br>
        <input type="checkbox" id="mush" name="mush" value="mush">
        <label for="mush">Mushroom</label><br>
        <input type="checkbox" id="jap" name="jap" value="jap">
        <label for="jap">Jalapeno</label><br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
