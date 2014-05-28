// using tag attributes. extremely bad practice.
// con: seperate javascript from html to update easily

<img src="images/pink.gif" onclick="alert('pushed pink')";

// using dot notation

document.getElementById('pink').onclick = function () {
	alert('clicked on pink');	
}

// using addEventListener
// pro: events can be triggered by non-dom elements, custom objects for instance
// pro: multiple events in a single call 
// con: not supported by IE8 and older. must use attachEvent()

document.getElementById('pink').addEventListener('click', function () {
	alert('click on pink');
}, false);

// using attachEvent on older browsers

if (!window.addEventListener) {

	document.getElementById('pink').attachEvent('onclick', function (){
		alert('click on pink');
	});	
}

// best way is to jQuery on method that works cross borwser

$('#pink').on('click', function (){

});

// events are propagated in two ways: capturing and bubbling

document.getElementById('pink').addEventListener('click', function (){
	alert('This fires first');

}, false);

// false -> bubbling
// true -> capturing

// stopping the propogation of a bubbling event 

e.stopPropogation();

// preventing default behavior for anchors

e.preventDefault();

// binding and triggering custom events 

// using JavaScript

var event = new Event('customEvent');

el.addEventListener('customEvent', function () {
	console.log('Build Event called on el');
});

el.dispatchEvent(event);

// using jQuery

el.on('customEvent', function () {
	console.log('customEvent called on el');
});

el.trigger('customEvent');
