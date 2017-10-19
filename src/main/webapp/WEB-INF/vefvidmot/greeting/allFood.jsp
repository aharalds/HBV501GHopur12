<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html lang="en">

<head>
    <title>Food! </title>  
</head>
<body>
	<form method="POST" name="foodVar" action="/greeting/moreInfo">
	<td>
	<select name="foodVar">
    	<c:forEach items="${allFood}" var="foodItem">
        	<option name="${foodItem.id }" value="${foodItem.id}" ${foodItem.id == selectedRole ? 'selected' : ''}>${foodItem.name}</option>
    	</c:forEach>
	</select>
	</td>
	<td><input type="submit" value="Velja"/></td>
	</form>
</body>
</html>