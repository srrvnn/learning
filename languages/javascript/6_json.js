/* 

what is JSON?

JavaScript Object Notation. Text format to share. Derived from JavaScript.

Easy to convert to a data structure -  mapped to a JavaScript object. 
Easy to read with minimal key-value formatting. 
Learner than XML. Easy to parse.

*/

var info = JSON.parse(data);

/*

how is it different from JavaScript object?

1. keys are wrapped in double quotes
2. keys can be any valid string 
3. JSON values have to one of six data types: string, number, boolean, object, array, null
4. JavaScript values can be any valid JavaScript structure, even a function 

*/

var info = JSON.parse(data);
var infostring = JSON.stringify(info);



/*

Working with JavaScript Objects

*/

var info = {

	"full_name" : "Saravanan Ganesh",
	"company" : "undefined"
};

console.log(info.full_name);
console.log(info["full_name"]);