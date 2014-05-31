var net = require('net');

net.createServer( function (sock){

	sock.on('data', function (data){

		// We have a connection - a socket object is assigned to the connection automatically
    	console.log('CONNECTED: ' + sock.remoteAddress +':'+ sock.remotePort);

    	// Add a 'data' event handler to this instance of socket
		sock.on('data', function(data) {

        	console.log('DATA ' + sock.remoteAddress + ': ' + data);
        	// Write the data back to the socket, the client will receive it as data from the server
        	sock.write('You said "' + data + '"');

    	});

    	// Add a 'close' event handler to this instance of socket
    	sock.on('close', function(data) {
	        console.log('CLOSED: ' + sock.remoteAddress +' '+ sock.remotePort);
    	});

	});

}).listen('3000','127.0.0.1');

console.log('Server listening on ' + '127.0.0.1' +':'+ '3000');