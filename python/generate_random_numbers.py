import random

number_values = 10

with open('random_numbers','w') as f:

	for i in range(number_values):		
		number = random.randint(1,1000000)		
		f.write(str(number)+" ")	

f.closed

print str(number_values) + ' numbers generated.'