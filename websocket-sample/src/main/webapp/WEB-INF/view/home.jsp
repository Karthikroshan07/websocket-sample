<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<html>
<head>
<title>Data Updation</title>
</head>

<body>
	<h3>Updation</h3>
	<form:form action="update" modelAttribute="userEntity">
		User Name: <form:input path="userName" />
		<br>
		<br>
		User Id: &nbsp &nbsp &nbsp <form:input path="userId" />
		<br>
		<br>
		<input type="submit" value="Update">
	</form:form>

</body>
</html>