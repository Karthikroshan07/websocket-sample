var stompClient = null;

function connect() {
	var socket = new SockJS('/websocket-sample-endpoint');
	stompClient = Stomp.over(socket);
	stompClient.connect({}, function(frame) {
		console.log('Connected: ' + frame);
		stompClient.subscribe('/topic/sample', function(userData) {
			var userData = JSON.parse(userData.body);
			document.getElementById("user-name").value = userData.userName;
			document.getElementById("user-id").value = userData.userId;
		});
	});
}

$(function() {
	connect();
});