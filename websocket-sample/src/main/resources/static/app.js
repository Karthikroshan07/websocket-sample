var stompClient = null;

function connect() {
	var socket = new SockJS('/websocket-sample-endpoint');
	stompClient = Stomp.over(socket);
	stompClient.connect({}, function(frame) {
		console.log('Connected: ' + frame);
		stompClient.subscribe('/topic/sample', function(userData) {
			var userData = JSON.parse(userData.body);
//			document.getElementById("user-name").value = userData.userName;
			for (var i = 0; i < userData.length; i++) {
				if (userData[i].userName == document.getElementById("user-name").value) {
					document.getElementById("user-id").value = userData[i].message;
					break;
				}
			}
		});
	});
}

$(function() {
	connect();
});