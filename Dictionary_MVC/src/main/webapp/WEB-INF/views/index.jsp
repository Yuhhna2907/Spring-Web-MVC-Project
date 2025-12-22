<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Từ điển Anh - Việt</title>
</head>
<body>

<h2>Tra cứu từ điển Anh - Việt</h2>

<form action="<c:url value='/search' />" method="post">
    <input type="text" name="word" placeholder="Nhập từ tiếng Anh" required/>
    <button type="submit">Tra cứu</button>
</form>

<hr/>

<c:if test="${not empty meaning}">
    <p><strong>Từ:</strong> ${word}</p>
    <p><strong>Nghĩa:</strong> ${meaning}</p>
</c:if>

<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>

</body>
</html>
