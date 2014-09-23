// global and local variables

console.log("myValue: " + myValue);

(function f() {

	myValue = 8;
	console.log("myValue: " + myValue);
}());

console.log("myValue: " + myValue);

// **********************************
// checking for null and undefined values

if (myVar === null)
if (typeof myVar === "undefined")

// state 1: the variable is not declared

// state 2: the variable is declared, not defined

// state 3: the variable is declared, defined as null

// state 4: the variable is declared, defined as undefined