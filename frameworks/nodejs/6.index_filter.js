var list = require('./module_filter.js');

var dir = process.argv[2];
var extension = process.argv[3];

list(dir, extension, function (err, data) {

	if(err !== null) 
		return console.error(err);

	data.forEach(function (file) {

		console.log(file);
	});
});