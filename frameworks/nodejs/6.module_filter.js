var fs = require('fs');
var path = require('path');

module.exports = function (dir, extension, callback) {

	fs.readdir(dir, function (err, data) {

		if (err !== null) 
			return callback(err);				

		data = data.filter(function (file) {
			return path.extname(file) === '.' + extension;
		});		

		callback(null, data);

	});
}