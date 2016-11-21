from random import randint

options = ["HEADS", "TAILS"]

"""
Flips the coin
"""
def flip(amount):
	global options
	i = 0

	print("Flipping your coin 10 times... \n")
	while i < amount:
		rand = randint(0, 1)
		print(options[rand])
		i += 1

"""
Main method
"""
def main():
	flip(10)
  
# Runs the program
main()
