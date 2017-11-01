<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
<title>Uppl�singar</title>
<link rel="stylesheet" href="../css/askUser.css">
</head>

<body>
	<div class="formbox">
		<h4>Nauðsynlegar upplýsingar</h4>
		<form method="POST" commandName="userInfo" action="/greeting/aboutDiet">
			<div class="info-form">
				<div class="input-row">
					<p>Nafn:</p>
					<input name="name" type="text" placeholder="Nafn" />
				</div>
				<div class="input-row">
					<p>Aldur:</p>
					<input name="age" type="number" min="10" max="110" />
				</div>
				<div class="input-row">
					<p>Hæð(cm):</p>
					<input name="height" type="number" min="130" max="230" />
				</div>
				<div class="input-row">
					<p>Þyngd(kg):</p>
					<input name="weight" type="number" min="35" max="180" />
				</div>
				<div class="button-row">
					<p>Kyn:</p>
					<div class="buttons">
						<input type="radio" id="male" name="gender" path="gender" value="M" label="Karl"/><label for="male">Karl</label>
						<input type="radio" id="female" name="gender" path="gender" value="F" label="Kona" /><label for="female">Kona</label></td>
					</div>
				</div>
				<div class="button-row">
					<p>Fjöldi æfinga í hverri viku:</p>
					<div class="buttons">
						<input type="radio" id="0-1" name="workout" path="workout" value="1"/><label for="0-1">0-1</label>
						<input type="radio" id="2-3" name="workout" path="workout" value="2"/><label for="1-3">2-3</label>
						<input type="radio" id="4-5" name="workout" path="workout" value="3"/><label for="1-3">4-5</label>
						<input type="radio" id="6-7" name="workout" path="workout" value="4"/><label for="1-3">6-7</label>
						<input type="radio" id="8" name="workout" path="workout" value="5"/><label for="1-3">8+</label>
					</div>
				</div>
				<div class="button-row">
					<p>Markmið:</p>
					<div class="buttons">
						<input type="radio" id="light" name="goal" path="goal" value="1"/><label for="light">Léttast</label>
						<input type="radio" id="avg" name="goal" path="goal" value="2"/><label for="avg">Viðhalda</label>
						<input type="radio" id="heavy" name="goal" path="goal" value="3"/><label for="heavy">Þyngjast</label>
					</div>
				</div>
				<div class="submit-button">
					<input type="submit" value="Áfram" />
				</div>
			</div>
		</form>
	</div>
</body>

</html>