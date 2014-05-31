var fs = require('fs');
var file = process.argv[2];

var contents = fs.readFile(file, 'utf8', function (err, data) {

	if (err !== false) {

		lines = data.split('\n').length - 1; 
		console.log(lines);
	}		
});