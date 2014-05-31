var fs = require('fs');
var path = require('path');

var dir = process.argv[2];
var filter = process.argv[3];

fs.readdir(dir, callback);

function callback(err, list) {

	if (err == null) {	

		for (var i = 0; i < list.length; i++)
			if (path.extname(list[i]).indexOf(filter) != -1)
				console.log(list[i]);
	}
}
