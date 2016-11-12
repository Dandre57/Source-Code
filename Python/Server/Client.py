# Tutorial Point Example

import socket

sock = socket.socket()
host = socket.gethostname()
port = 4321
sock.connect(host, port)
print(sock.recv(1024))
sock.close()
