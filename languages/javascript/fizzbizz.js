function fizzbizz(n) {

	if (n%3 === 0 && n%5 === 0) {

		console.log("fizzbizz");

	} else if (n%3 === 0) {

		console.log("fizz");

	} else if (n%5 === 0) {

		console.log("bizz");

	} else console.log(n);
}