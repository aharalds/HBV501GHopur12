<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
<title>Check</title>
</head>
<body>
	<table>
	   <thead>
       <tr>
           <th></th>
           <th>Þörf</th>
           <th>Borðað</th>
           <th>Hlutfall komið</th>
        </tr>
        </thead>
		<tr>
			<td>BMR:</td>
			<td>${userInfo.bmr }</td>
		</tr>
		<tr>
			<td>FAT</td>
			<td>${userInfo.nutrition.fat }</td>
			<td>${userInfo.nutrition.pfat }</td>
			<td>${userInfo.nutrition.procentFat }%</td>
		</tr>
		<tr>
			<td>CARBS</td>
			<td>${userInfo.nutrition.carbs }</td>
			<td>${userInfo.nutrition.pcar }</td>
			<td>${userInfo.nutrition.procentCarbs }%</td>
		</tr>
		<tr>
			<td>PROTEIN</td>
			<td>${userInfo.nutrition.protein }</td>
			<td>${userInfo.nutrition.ppro }</td>
			<td>${userInfo.nutrition.procentProtein }%</td>
		</tr>
	</table>
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
	<form method="POST" action="showUser"><input type="submit" /></form>
</body>

</html>