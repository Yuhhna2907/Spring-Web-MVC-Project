<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Sandwich Condiments</title></head>
<body>
<h2>Sandwich Condiments</h2>
<form action="save" method="post">
    <input type="checkbox" name="condiment" value="Lettuce" /> Lettuce
    <input type="checkbox" name="condiment" value="Tomato" /> Tomato
    <input type="checkbox" name="condiment" value="Mustard" /> Mustard
    <input type="checkbox" name="condiment" value="Sprouts" /> Sprouts
    <br/><br/>
    <input type="submit" value="Save" />
</form>
</body>
</html>