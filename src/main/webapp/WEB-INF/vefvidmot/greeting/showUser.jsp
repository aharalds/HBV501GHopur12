<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    	<h4>Nauðsynleg næringargildi</h4>
	<table>
		<tr>
			<td>BMR:</td>
			<td>${userInfo.getBmr()}</td>
			<td>
		</tr>
		<tr>
			<td>FAT</td>
			<td>${userInfo.nutrition.fat }</td>
			<td>${userInfo.nutrition.procentFat }%</td>
		</tr>
		<tr>
			<td>CARBS</td>
			<td>${userInfo.nutrition.carbs }</td>
			<td>${userInfo.nutrition.procentCarbs }%</td>
		</tr>
		<tr>
			<td>PROTEIN</td>
			<td>${userInfo.nutrition.protein }</td>
			<td>${userInfo.nutrition.procentProtein }%</td>
		</tr>
	</table>
</head>
<body>

<h1></h1>

</body>

</html>