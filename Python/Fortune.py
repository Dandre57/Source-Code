# This program will print a random quote from the given array

from random import randint
from tkinter import *

root = tkinter.TK()

# Will hold list of different quotes
fortune[] = {""}

"""
This method will return a random quote from the array 
"""
def randQuote():
  global fortune
  
  length = len(fortune)
  rand = randint(0, length) - 1 
  advice = fortune[rand]
  return advice

"""
This method creates the interface that will create the main GUI
"""
def mainInterface():
  global root
  
  root.title("Fortune Cookie")
  root.geometry("500x400")
 
  picture = tkinter.PhotoImage(file="filepath/FortuneCookie.jpeg")
  cookiePic = tkinter.Label(root, image=picture)
  cookiePic.pack()
  
  butt = tkinter.Button(root, "Click For A Fortune!", command=)
  butt.pack()
  
  root.mainloop()

def popUpWindow():
  global root 
  
  root
  
