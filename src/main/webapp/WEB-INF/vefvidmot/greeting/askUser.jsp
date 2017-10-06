<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
<title>Uppl�singar</title>
</head>
<body>
	<h4>Nau�synlegar uppl�singar</h4>
	<form method="POST" commandName="userInfo" action="/greeting/aboutDiet">
		<table>
			<tr>
				<td>Nafn</td>
				<td><input name="name" type="text" placeholder="Nafn" /></td>
			</tr>
			<tr>
				<td>Aldur</td>
				<td><input name="age" type="number" min="10" max="110" /></td>
			</tr>
			<tr>
				<td>H��(cm)</td>
				<td><input name="height" type="number" min="130" max="230" /></td>
			</tr>
			<tr>
				<td>�yngd(kg)</td>
				<td><input name="weight" type="number" min="35" max="180" /></td>
			</tr>
			<div>
			<tr>
				<td>Kyn:</td>
				<td><input type="radio" id="male" name="gender" path="gender" value="M" label="Karl"/><label for="male">Karl</label>
					<input type="radio" id="female" name="gender" path="gender" value="F" label="Kona" /><label for="female">Kona</label></td>
			</tr>
			</div>
			<div>
				<tr>
					<td>Fj�ldi �finga � hverri viku</td>
				</tr>
				<tr>
				<td>
					<input type="radio" id="0-1" name="workout" path="workout" value="1"/><label for="0-1">0-1</label>
					<input type="radio" id="2-3" name="workout" path="workout" value="2"/><label for="1-3">2-3</label>
					<input type="radio" id="4-5" name="workout" path="workout" value="3"/><label for="1-3">4-5</label>
					<input type="radio" id="6-7" name="workout" path="workout" value="4"/><label for="1-3">6-7</label>
					<input type="radio" id="8" name="workout" path="workout" value="5"/><label for="1-3">8+</label>	
				</td>
				</tr>
			</div>
			<div>
				<tr>
					<td>Markmi�</td>
				</tr>
				<tr>
				<td>
					<input type="radio" id="light" name="goal" path="goal" value="1"/><label for="light">L�ttast</label>
					<input type="radio" id="avg" name="goal" path="goal" value="2"/><label for="avg">Vi�halda</label>
					<input type="radio" id="heavy" name="goal" path="goal" value="3"/><label for="heavy">�yngjast</label>
				</td>
				</tr>
			</div>
			<tr>
				<td><input type="submit" value="�fram" /></td>
			</tr>
		</table>
	</form>
	</h1>

</body>

</html>