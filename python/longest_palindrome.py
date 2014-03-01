# finding longest palindrome in a String

# need patch for: stream = ['a','b','b','b']

stream = ['a','b','a','b','a','b','a']

stack = []
palindrome = []

stack_top = ''
stack_runner = ''

flag_building_palindrome = False
flag_odd_palindrome = False

for letter in stream: 

	print('')
	print('Letter:' + letter)
	print('-')	

	if not flag_building_palindrome: 

		# starting steps when the stack is empty	

		if len(stack) == 0:

			flag_building_palindrome = True
			flag_odd_palindrome = True

			palindrome.append(letter)

		# checking for a palindrome starting with top or runner

		else: 

			if stack_top == letter:

				flag_building_palindrome = True
				
				palindrome.append(stack.pop())								

			elif stack_runner == letter: 

				flag_building_palindrome = True
				flag_odd_palindrome = True				
				
				palindrome.append(stack.pop())
				palindrome.append(stack.pop())

			else: 

				stack.append(letter)		

	else: 

		if stack_top != letter: 

			flag_building_palindrome = False

			print('Palindrome Graduates: ', end='')			

			for l in list(reversed(palindrome)):
				stack.append(l)
				print (l,end=''),

			flag_first_element = True

			for l in palindrome:

				if(flag_odd_palindrome and flag_first_element):

					flag_first_element = False
					continue				

				stack.append(l)				

			print('-')

			palindrome = []
			stack.append(letter)

		else: 

			palindrome.append(stack.pop())

	if len(stack) > 0:
		stack_top = stack[len(stack)-1]

	else: 
		stack_top = ''

	if len(stack) > 1:				
		stack_runner = stack[len(stack)-2]				

	else: 
		stack_runner = ''

	print('Stack:' + str(stack))
	print('Palindrome:' + str(palindrome))


if flag_building_palindrome:

	flag_building_palindrome = False

	print('Palindrome Graduates: ', end='')			

	for l in list(reversed(palindrome)):
		stack.append(l)
		print (l,end=''),

		flag_first_element = True

	for l in palindrome:

		if(flag_odd_palindrome and flag_first_element):

			flag_first_element = False
			continue				

			stack.append(l)				

	print('-')

	palindrome = []