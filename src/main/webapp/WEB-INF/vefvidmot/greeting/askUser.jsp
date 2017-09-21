<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Hver ert þú? !!!! :D</title>
</head>
<body>

<h1>
<form method="POST" action="/greeting/hver">
	Hva� heitir notandinn? 
	<input name="nafn" type="text" placeholder="Nafn"></input>
	<input type="submit" value="�fram" />
</form>
</h1>

</body>

</html>