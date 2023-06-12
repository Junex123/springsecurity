<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<form action="addEntry">
		<div>Add or Update a new journal entry :</div>
		<br>
		<div>Id:</div>
		<input type="text" name="id"><br>
		<div>Title:</div>
		<input type="text" name="title"><br>
		<div>Username:</div>
		<input type="text" name="username"><br>
		<div>Password:</div>
		<input type="text" name="password"><br>
		<div>Category:</div>
		<input type="text" name="category"> <br> <br> <input
			type="submit"> <br>
	</form>
	<br>
	<br>
	<form action="getEntry">
		<div>Get a specific journal entry by id :</div>
		<br> <input type="text" name="id"> <br> <br> <input
			type="submit"> <br>
	</form>
	<br>
	<br>
	<form action="getAllEntries">
		<div>Get all journal entries:</div>
		<br>
		<input type="submit">
	</form>
	<br>
	<br>
	<form action="deleteEntry">
		<div>Delete a specific journal entry by id:</div>
		<br> <input type="text" name="id"> <br> <br> <input
			type="submit"> <br>
	</form>

</body>
</html>