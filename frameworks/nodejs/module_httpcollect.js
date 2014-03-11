var http = require('http');
var bl = require('bl');
var concatStream = require('concat-stream');

module.exports = function (url, callback) {

	http.get(url, function (response) {

		var result = "";

		response.setEncoding("utf8");
		response.pipe(concatStream(function (data) {			

			callback(null, data);
		}));
	});
}