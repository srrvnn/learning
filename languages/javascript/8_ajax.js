// making an AJAX call 

var xhr; 

if (Window.XMLHTTPRequest) {

	xhr = new XMLHTTPRequest();

} else {

	xhr = new ActiveXObject("Microsoft.XMLHTTP");
}

xhr.open('POST', target_url); // opens a connection, open(method, URL, async)
xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded"); // sets header for POST requests

xhr.onreadystatechange = function() {

	if (xhr.status === 200 && xhr.readyState === 4)
		doSomething();
}

xhr.send();
