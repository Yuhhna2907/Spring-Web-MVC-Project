<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Selected Condiments</title></head>
<body>
<h2>You selected:</h2>
<ul>
    <c:forEach var="item" items="${selectedCondiments}">
        <li>${item}</li>
    </c:forEach>
</ul>
</body>
</html>