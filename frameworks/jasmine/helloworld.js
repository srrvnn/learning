describe("Test Suite for HelloWorld", function() {

	it("Test Spec for HelloWorld", function() {

		var text = "Hello World";

		expect(text).toBe("Hello World"); // compares with a ===
		expect(text).not.toBe("Anything other than Hello World");

		expect(text).toEqual();
		expect(text).toMatch();
		expect(text).toBeDefined();
		expect(text).toBeNull();

		beforeEach(function() {

			console.log("All the powers combine. We are going to test a spec.");
		});

		afterEach(function() {

			console.log("Test Spec complete. Your code looks beautiful.");
		})

	});

});