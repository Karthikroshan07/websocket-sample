<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<html>
<head>
<title>Send Message</title>
</head>

<body>
	<h3>Send Message</h3>
	<form:form action="update" modelAttribute="userEntity">
		User Name: <form:input path="userName" />
		<br>
		<br>
		Message: &nbsp &nbsp <form:input path="message" />
		<br>
		<br>
		<input type="submit" value="Send">
	</form:form>

</body>
</html>