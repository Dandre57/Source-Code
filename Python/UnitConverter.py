"""
Unit conversions:

temp (celcius and fahrenheit)
volume (meters and liters)
mass (grams)
"""

# Method that handles the temperature
def temperature():
  temp = raw_input("Would you like to convert into Celcius or into Fahrenheit? ").lower()
  
  if(temp == "celsius"):
    c = raw_input("Enter the amount you would like to convert: ")
    conversion = (c - 32) * (5 / 9)
    print("Conversion: " + c + " to " + conversion)
    
  elif(temp == "fahrenheit"):
    f = raw_input("Enter the amount you would like to convert: ")
    conversion = f * (9 / 5) + 32
    print("Conversion: " + f + " to " + conversion)
  
  else:
    print("Sorry that input isn't valid.")
    temperature()
    
# Method that handles the mass
def mass():
  m = raw_input("").lower()
  
  
  
# Method that handles volume
def volume():
  v = raw_input("").lower()
  
  
# Method that does metric conversions
def metric(input):
  if(input == "kilo"):
    conversion *= 1000
    
  elif(input == "hecto"):
    conversion *= 100
    
  elif(input == "deca"):
    conversion *= 10
    
  elif(input == "deci"):
    conversion /= 10
    
  elif(input == "centi"):
    conversion /= 100
    
  elif(input == "milli"):
    conversion /= 1000
    
  else:
    print("")
    
# Main method
def main():
  

#
