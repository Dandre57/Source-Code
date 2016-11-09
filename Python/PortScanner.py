from tld import get_tld
from socket import gethostbyname
import os


def get_domain_name(url):
    domain_name = get_tld(url)
    return domain_name


def get_ip_address(url):
    return gethostbyname(url)


def port_scan(ip):
    command = "nmap " + ip
    process = os.popen(command)
    results = str(process.read())
    return results


input = raw_input("Enter a url: ")

print("Domain Name: " + get_domain_name(input) + " \n")
print("IP Address: " + get_ip_address(input) + " \n")
print("Open Ports: " + port_scan(get_ip_address(input)) + " \n")
