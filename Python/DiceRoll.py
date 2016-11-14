# This program rolls two six sided dice

from random import randint

def rollDice():
  print("Rolling the dice...")
  firstDice = randint(1, 6)
  secondDice = randint(1, 6)
  print(firstDice + "\t" + secondDice + "\n")
  
def main():
  rollDice()
  
  input = raw_input("Would you like to roll again?").lower()
  while input == "yes":
    rollDice()
    
main()
