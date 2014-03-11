function print(name) {

	return "Hello " + name;
}


test(print(), function() {

	equal(print("Sashi"), "Hello Sashi", "Hello Sashi Printed");
});