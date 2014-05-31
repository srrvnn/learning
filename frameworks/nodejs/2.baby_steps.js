var sum = 0;

for (var index = 2; index < process.argv.length; index++) {

		sum = sum + +process.argv[index];
	}	
}

console.log(sum);