var collect = require('./module_httpcollect.js');
var url = process.argv[2];

collect(url, function (err, data) {

	if (err)
		return console.error(err);
			
	console.log(data.length);
	console.log(data);
});