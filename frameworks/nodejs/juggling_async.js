var http = require('http');
var urls = [process.argv[2], process.argv[3], process.argv[4]];

var data_response = [];

urls.forEach( function (url) {

	http.get(url, function (response) {

		// console.log(response.toString());
		// console.log();
	});
});

// function print() {

// 	data_response.forEach( function (res) {

// 		console.log(res);
// 	});
// }








