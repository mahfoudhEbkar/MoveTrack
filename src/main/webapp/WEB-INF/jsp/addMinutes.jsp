<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add Minutes</title>
</head>
<body>
	<h4>Add Minutes :</h4>

	<form:form commandName="exercise">
		<table>
			<tr>
				<td>Minutes For Today:</td>
				<td><form:input path="minutes" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Enter" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>