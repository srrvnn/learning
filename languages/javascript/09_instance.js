document.addEventListener('DOMContentLoaded', function () {

	var experiment = 3;

	// experimenting with obj1 : plain object literal

	if (experiment == 1) {

		var a = Object.create(obj1);
		var b = Object.create(obj1);

		a.variable1 = "Hello World from A";
		b.function1(); // prints Hello World from function1

	}

	// experimenting with obj2 : constuctor function that returns an object literal

	if (experiment == 2) {

		var c = new obj2();
		var d = new obj2();

		c.function2_set("Hello World from C");

		c.function2_print();
		d.function2_print(); // prints Hello World from C from function2_private

		console.log(c.variable2);
	}

	// experimenting with obj3 : factory function that returns an object literal

	if (experiment == 3) {

		var e = obj3();
		var f = obj3();

		e.function3_set("Hello World from C");

		e.function3_printa();
		f.function3_printa(); // prints Hello World from C from function3_private

		console.log(e.variable3);
		console.log(e.function3_get());
	}

});