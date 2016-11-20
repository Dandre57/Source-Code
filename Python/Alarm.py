import pyglet
import time
import os

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
  
def main():
  userHour = raw_input("")
  userMinute = raw_input("")
  
  timer(userHour, userMinute)
