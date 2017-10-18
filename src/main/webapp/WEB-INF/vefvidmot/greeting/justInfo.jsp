<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
<title>Check</title>
</head>
<body>
	<table>
		<tr>
			<td>BMR:</td>
			<td>${bmr }</td>
		</tr>
		<tr>
			<td>FAT</td>
			<td>${userInfo.nutrition.fat }</td>
		</tr>
		<tr>
			<td>CARBS</td>
			<td>${userInfo.nutrition.carbs }</td>
		</tr>
		<tr>
			<td>PROTEIN</td>
			<td>${userInfo.nutrition.protein }</td>
		</tr>
	</table>
</body>

</html>