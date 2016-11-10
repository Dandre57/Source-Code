# This program will print a random quote from the given array

from random import randint
from tkinter import *

# Will hold list of different quotes
fortune[] = {""}

def randQuote(advice):
  length = len(advice)
  rand = randint(0, length) - 1 
  choice = advice[rand]
  return choice

def interface():
  root = tkinter.TK()
  root.title("Fortune Cookie")
  root.geometry("500x400")
 
  picture = tkinter.PhotoImage(file="filepath/FortuneCookie.jpeg")
  cookiePic = tkinter.Label(root, image=picture)
  cookiePic.pack()
  
  butt = tkinter.Button(root, "Click For A Fortune", command=)
  butt.pack()
  
  root.mainloop()
