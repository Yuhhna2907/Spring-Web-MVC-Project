<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>USD to VND</title>
</head>
<body>
<h2>Chuyển đổi USD sang VND</h2>

<form action="convert" method="post">
    <label>Tỷ giá (VND/USD):</label>
    <input type="number" step="0.01" name="rate" required/><br/><br/>

    <label>Số tiền USD:</label>
    <input type="number" step="0.01" name="usd" required/><br/><br/>

    <button type="submit">Chuyển đổi</button>
</form>

</body>
</html>
