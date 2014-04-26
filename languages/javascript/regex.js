// using regular expressions or regex 

var regex = /^\d{2}$/;
var string = "29";

regex.test(string);
regex.exec(string);

string.search(regex);
string.replace(regex,"");
string.split(regex);
string.match(regex);