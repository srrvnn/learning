// Mozilla Developer Network's Extensive Writeup
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions

// two ways to initiate a regular expression

var re = /^\d{2}$/; // regular expression literal : use this when the regex is going to be constant
var re = new RegExp("ab + c"); // regular expression object : use this when the regex is coming from another source

// two functions of Regex object

regex.test(string); // returns true of false

regex.exec(string); // returns an array of information or null

// four functions of String object

string.search(regex); // returns the index of the match or -1

string.match(regex); // returns an array of information or null

string.replace(regex,""); // does a search and replaces the result

string.split(regex); // used to break a string into substrings - returns an array