# Tutorial Point Example

import socket

sock = socket.socket()
host = socket.gethostname()
port = 4321
sock.bind(host, port)

sock.listen()
while True:
  
