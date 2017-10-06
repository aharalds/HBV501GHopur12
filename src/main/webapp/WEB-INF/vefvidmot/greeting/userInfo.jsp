<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
<title>G��an daginn!</title>
</head>
<body>

	<h1>G��an daginn ${userInfo.getName()}</h1>
	<table>
		<tr>
			<td>�yngd:</td>
			<td>${userInfo.getWeight()}</td>
		</tr>
		<tr>
			<td>H��:</td>
			<td>${userInfo.getHeight()}</td>
		</tr>
		<tr>
			<td>Aldur:</td>
			<td>${userInfo.getAge()}</td>
		</tr>
	</table>
	<h4>Nau�synleg n�ringargildi</h4>
	<table>
		<tr>
			<td>BMR:</td>
			<td>${userInfo.getBmr()}</td>
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
	<tr>
		<td>
			<form method="POST" action="spyrjaNotanda">
				<input type="submit" value="Hreinsa" />
			</form>
		</td>
	</tr>



</body>

</html>