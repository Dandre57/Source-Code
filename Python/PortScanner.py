#This program takes the URL inputed by the user and returns the Domain Name, IP Address, and any Open Ports

from tld import get_tld
from socket import gethostbyname
import os

"""
This method uses the URL given and returns the Domain Name
"""
def get_domain_name(url):
    domain_name = get_tld(url)
    return domain_name


"""
This method uses the URL given and returns the IP Address
"""
def get_ip_address(url):
    return ip_address(url)


"""
This method uses the IP Addresses of the given URL and returns the Open Ports
"""
def port_scan(ip):
    command = "nmap " + ip
    process = os.popen(command)
    ports = str(process.read())
    return ports


input = raw_input("Enter a url: ")


"""
These statesments print the information created by the methods
"""
print("Domain Name: " + get_domain_name(input) + " \n" +
      "IP Address: " + get_ip_address(input) + " \n" +
      "Open Ports: " + port_scan(get_ip_address(input)) + " \n")
