// declaring functions with new

function Counter(count) {

	this.count = count;	
}

var c = new Counter(1);

console.log(c.count);