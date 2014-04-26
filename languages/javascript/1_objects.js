"use strict";

// define an object

var obj = new Object();
var obj = {};

// add properties to an object

obj.firstname = "Saravanan";
obj.lastname = "Ganesh";

// count properties in an object

console.log(Object.keys(obj).length);

// cycle properties in an object

for (var p in obj) {

	if (obj.hasOwnProperty(p)) {

		console.log(p + ":" + obj[p]);	
	}	
}

// check variable in an object

if (typeof obj.lastname == "undefined") {

	console.log("lastname undefined;");
}

// here are other kinds of objects: functions, arrays, regexs

var f = function () {};

var a = [];
var r = new RegExp();