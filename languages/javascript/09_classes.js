// plain object literal. 

// does not allow private variables and private functions.
// use Object.create() for multiple instances

var obj1 = {

	variable1 : "Hello World",
	function1 : function (){

		console.log(this.variable1 + " from function1");
	}
}

// constructor function that returns an object literal

// allows private variables by use of var instead of this.
// use new ojb2() to create multiple instances

var obj2 = function () {

    var variable2 = "Hello World";
    this.function2_set = function (v) {

    	variable2 = v;
    };
    this.function2_print = function () {
        console.log(variable2);
    };
};

// factory function that returns an object

var obj3 = function () {

	var variable3 = "Hello World";
	var function3_private = function () {

		return variable3 + " from function3_private";
	}

	return {

		function3_get : function () {

			return variable3;
		},

		function3_set : function (v) {

			variable3 = v;
		},

		function3_print : function () {

			console.log(function3_private());
		}, 

		function3_printa : function () {

			this.function3_print();
		}
	};
	
};

// function that returns an object literal a little differently

var obj4 = function () {

	var o4 = {

		variable4 : "Hello World",

		function4_private : function () {

			return this.variable4 + " from function4_private";
		},

		function4_set : function (v) {

			this.variable4 = v;
		},

		function4_print : function () {

			console.log(this.function4_private());
		}
	}
	
	return {

		function4_s : o4.function4_set,
		function4_p : o4.function4_print,
		function4_pr : this.function4_p
	};
	
};