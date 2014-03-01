function Employee(name) {

	this.name = name;
	this.say = function () {

		console.log("My name is " + name);
	}
}

function EmployeeFactory() {

	this.create = function(name) {

		return new Employee(name);
	}
}


// global and local variables 


console.log("myValue: " + myValue);

(function f() {

	myValue = 8;	
	console.log("myValue: " + myValue);
}());



console.log("myValue: " + myValue);

// declaring functions with new

function Counter(count) {

	this.count = count;	
}

var c = new Counter(1);

console.log(c.count);

// checking null, undefined and other checks

if (typeof myVar == "undefined") {

}