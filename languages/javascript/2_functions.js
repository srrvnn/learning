// declaring functions with new

function Counter(count) {

	this.count = count;	
}

var c = new Counter(1);

console.log(c.count);

// constuctor functions. those used to create an object. 
// use the 'this' keyword and start with an uppercase letter.

function Foo(fname, lname) {

	this.firstname = fname;
	this.lastname = lname;

	this.callout = function () {

		console.log("Hey, " + this.firstname + " " + this.lastname);
	}
}

// constuctor function is called with a new operator. 

var f = new Foo();