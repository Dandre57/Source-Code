# Game where the user guesses a random number between one and ten

from random import randint
import tkMessageBox

def randNumber():
	number = randint(0, 10)
	return number

def main():
	input = raw_input("Guess a number between 1 and 10: ")

	if input == randNumber():
		# create line where a pop up box appears if it is right
		# create line where program will exit if right

	elif input > 10:
		# create a pop up box saying the number is not valid
		# main()

	else:
		# create a pop up box saying there is an error
		# main()


	 
