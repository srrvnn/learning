var learn = {

	AJAX: "Asynchronous JavaScript and XML",
	xhr : "XML Http Request",
}

// simple xhr Request

var request = new XMLHttpRequest();

request.open('GET', 'data.txt', false);
request.send();

if (request.status === 200) {

	console.log(request);	
	console.log(request.responseText);
}

// on ready state change

request.onreadystatechange = function (){

	if ((request.status === 200) && (request.readyState === 4)) {

		console.log(request);	
		console.log(request.responseText);
	}
}

// backwards compatibility 

var request; 

if (window.XMLHttpRequest) {

	request = new XMLHttpRequest();

} else {

	request = new ActiveXObject("Microsoft.XMLHTTP");
}

// dom manipuation - single element

var modify = document.getElementById('update');
modify.innerHTML = request.responseText;

// dom manipuation - multiple elements;

var modify = document.getElementsByTagName('li');
modify[0].innerHTML = request.responseText;

// parsing XML data 

var xmlData = request.responseXML;
console.log(xmlData.getElementsByTagName('name')[1].firstChild.nodeValue);

// parsing JSON data 

var json = JSON.parse(request.responseText);
for (var key in json) console.log(json[key].name);

// ajax using jQuery 

$('#update').load('data.txt');

$.getJSON('data.json', function (data){

	$.each(data, function (key, val)){
		console.log(val.name);
	});
});

$.post('data.json', function (data) {
    console.log(data + 'received');
})

var readmore = 'http://api.jquery.com/category/ajax/';