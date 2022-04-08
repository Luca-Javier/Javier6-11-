import requests

url="https://www.facebook.com/"

r= requests.get(url)

file1 = open("archivo.txt", "w")
file1.write(r)
print(r)


""" Devuelve <Response [200]> """









