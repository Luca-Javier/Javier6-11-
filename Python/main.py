import requests

if __name__ == "__main__":

    url = "https://http.dog/"
    response= requests.get(url)
    print(response)

if response.status_code == 200:
    contenido = response.headers['Content-Type']
    
    print(contenido)

    file = open("archivo.txt", "w")
    file.write(contenido + "          "+str(response))
    file.close()
    









