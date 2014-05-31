// best practice is use a library

var libraries = {

	"selfish.js" : "https://github.com/Gozala/selfish",
	"klass" : "https://github.com/ded/klass"
};

// but why should they have all the fun?

var posts = [

	{	url : "https://alexsexton.com/blog/2013/04/understanding-javascript-inheritance/",
		comments: "absolutely useless"  },
	{	}

];


// base class: Human

function Human(name) {

	this.name = name;
}

Human.prototype.sayHi = function () {

	console.log("Hi. I am " + this.name + ".");
	return this;
}

Human.prototype.sayMore = function () {

	console.log("I am existing");
	return this;
}

// derived class: Student

function Student(name) {

	Human.apply(this);
	this.name = name;
}

Student.prototype = Object.create(Human.prototype);

var sashi = new Student("Saravanan Ganesh");






// douglas's code to create a function uber that takes in a function name
// and calls the function from the parent's prototype (?).

// TODO: understand

var d = {},
p = this.prototype;
Student.prototype.uber = function (name) {
	if (!(name in d)) {
    	d[name] = 0;
	}
	var f, r, t = d[name], v = parent.prototype;
	if (t) {
    	while (t) {
        	v = v.constructor.prototype;
        	t -= 1;
    	}
    	f = v[name];
	} else {
    	f = p[name];
    	if (f == this[name]) {
        	f = v[name];
	    }
	}
	d[name] += 1;
	r = f.apply(this, Array.prototype.slice.apply(arguments, [1]));
	d[name] -= 1;
	return r;
}