function Employee(name) {

	this.name = name;
	this.say = function () {

		console.log("My name is " + name);
	}
}

function EmployeeFactory() {

	this.create = function(name) {

		return new Employee(name);
	}
}