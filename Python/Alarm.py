import tkinter  # Used for the window
import pyglet   # Used for the music 
import time     #
import sys      # Used to import the exit command

"""
Creates the music for the alarm
"""
def musicPlayer():
  music = pyglet.media.load(".mp3", streaming=False)
  music.play()
  
"""
Plays the music when the alarm goes off
"""
def timer(hour, minute):
  currentTime = time.localtime()
  if(currentTime.tm_hour == int(hour) and currentTime.tm_min == int(minute)):
    musicPlayer()
    window()

"""
Creates a window to shut the program off
"""
def window():
  root = tkinter.TK()
  
  root.title()
  root.geometry()
  butt = tkinter.Button(root, "Click To Stop This!", command=sys.exit())
  butt.pack()
  
  root.mainloop()
  
"""
Main method
"""
def main():
  userHour = raw_input("Input the hour: ")
  userMinute = raw_input("Input the minute: ")
  
  timer(userHour, userMinute)

main()
