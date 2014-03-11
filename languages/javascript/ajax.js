// making an AJAX call 

var xhr; 

if (Window.XMLHTTPRequest) {

	xhr = new XMLHTTPRequest();

} else {

	xhr = new ActiveXObject(Microsoft.XMLHTTP);
}

xhr.open("POST", target_url, false); // opens a connection, open(method, URL, async)
xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded"); // sets header for POST requests

xhr.onreadystatechange = doSomething();

xhr.send();


// using regular expressions or regex 

var regex = /^\d{2}$/;
var string = "29";

regex.test(string);
regex.exec(string);

string.search(regex);
string.replace(regex,"");
string.split(regex);
string.match(regex);

https://7c2333f699a50d56764c002427b976b290d72f5c@github.com/srrvnn/code.git