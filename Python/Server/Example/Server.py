# Tutorial Point Example

import socket

sock = socket.socket()
host = socket.gethostname()
port = 4321
sock.bind(host, port)

sock.listen()
while True:
  connection, address = sock.accept()
  print("Got connection from:" + address)
  connection.send("You're connected")
  connection.close()
  
