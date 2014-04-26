goto: 'http://www.hunlock.com/blogs/Mastering_Javascript_Arrays'
goto: 'https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array?redirectlocale=en-US&redirectslug=JavaScript%2FReference%2FGlobal_Objects%2FArray'

// creating an array

var myArray = []; 
var myArray = new Array();

// populating an array

myArray = ['Monday', 'Tuesday'];

myArray[0] = 'Monday';
myArray[3] = 'Tuesday'; // if you skip an element, the blank element will be undefined

// passing the array around

var myArray = [];

var refArray = myArray();
var valArray = myArray.slice();

function passByReference(refArray) {};
function passByValue(valArray) {};

// length of an array

myArray.length; 

/*

arr.length is a property, not a function. 
arr.length stores the 1 + the hightest index 

*/

// methods 

var arr = arr1.concat(arr2, arr3);

var bool = arr1.every(function1);
var bool = arr1.some(function1);

var arr2 = arr1.filter(function1);

arr1.forEach(function1);
function function1(value, index, array) {};

var str = arr1.join(' - '); // default is ","

var found = arr1.indexOf('s');
var found = arr1.lastIndexOf('s');

var arr2 = arr1.map(function1);
function function1(value, index, array) {};

var el = arr1.pop(); // remove and return the last element
var el = arr1.shift(); // remove and return the first element

arr1.push(el1, el2, el3); // add at the end
arr1.unshift(el1, el2, el3) // add at the beginning

arr1.reverse();

arr1.sort(function2);
function function2(a, b) {

	// returns -1 if a < b
	// returns  0 if a = b
	// returns  1 if a > b
}

arr1.slice();
arr1.slice(3, 5);

var val = arr1.reduce(function1);
var val = arr1.reduceRight(function1);

var arr_removed = arr1.splice(5, 1, '65', '78');