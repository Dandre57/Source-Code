from tkinter import *
import pyglet
import time
import os
import sys

root = tkinter.TK()

def musicPlayer():
  music = pyglet.media.load(".mp3", streaming=False)
  music.play()
  
def timer(hour, minute):
  currentTime = time.localtime()
  if(currentTime.tm_hour == int(hour) and currentTime.tm_min == int(minute)):
    musicPlayer()
    window()

def window():
  """
  Add statements to create thw window
  """
  global root
  
  root.title()
  root.geometry()
  butt = tkinter.Button(root, "Click To Stop This!", command=sys.exit())
  butt.pack()
  
  root.mainloop()
  
def main():
  userHour = raw_input("Input the hour: ")
  userMinute = raw_input("Input the minute: ")
  
  timer(userHour, userMinute)
