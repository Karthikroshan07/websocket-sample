<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<html>
<head>
<title>View Message</title>
<link href="/main.css" rel="stylesheet">
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/sockjs-client/sockjs.min.js"></script>
<script src="/webjars/stomp-websocket/stomp.min.js"></script>
<script src="/app.js"></script>
</head>
<body>
	<h3>View Message</h3>
	<table>
		<tr>
			<td><label>User Name: &nbsp</label></td>
			<td><input disabled="true" type="text" id="user-name" value="<security:authentication property="principal.username"/>"></td>
		</tr>
		<br>
		<tr>
			<td><label>Message: </label></td>
			<td><input disabled="true" type="text" id="user-id"></td>
		</tr>
	</table>
</body>
</html>