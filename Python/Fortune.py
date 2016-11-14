# This program will print a random quote from the given array

from random import randint
from tkinter import *
import tkMessageBox

# Will hold list of different quotes
fortune[] = {""}
root = tkinter.TK()

"""
This method will return a random quote from the array 
"""
def randomQuote():
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
 
  addPictures()

  butt = tkinter.Button(root, "Click For A Fortune!", command=popUpWindow())
  butt.pack()
  
  root.mainloop()

"""
This method adds pictures to the main interface
"""
def addPictures():
  global root
  
  firstPicture = tkinter.PhotoImage(file="filepath/FortuneCookie.jpeg")
  cookiePic = tkinter.Label(root, image=firstPicture)
  cookiePic.pack(anchor=CENTER)

  secondPicture = tkinter.PhotoImage(file="filepath/.jpeg")
  firstEmojiPic = tkinter.Label(root, image=secondPicture)
  firstEmojiPic.pack()
  
  thirdPicture = tkinter.PhotoImage(file="filepath/.jpeg")
  secondEmojiPic = tkinter.Label(root, image=thirdPicture)
  secondEmojiPic.pack()

  
"""
This method creates a pop up window that shows you your fortune
"""
def popUpWindow():
  tkMessageBox.showinfo("Your Fortune", randomQuote())
