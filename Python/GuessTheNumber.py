# Game where the user guesses a random number between one and ten

from random import randint

"""
Creates the random number between 1 and 10
"""
def randNumber():
	number = randint(0, 10)
	return number

"""
Takes the users guess and will re-run the program if they are wrong
"""
def main():
	input = raw_input("Guess a number between 1 and 10: ")
	conversion = int(input)

	if conversion == randNumber():
		print("You Actually Got It Right! \n")

	elif conversion > 10 or converion < 0:
		print"The number you input was out of range. \n")
		main()

	else:
		print("There was an error in the program. \n")
		main()
		
# Runs the program	
main()
