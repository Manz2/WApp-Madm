import requests

# Definiere die URLs für die Anfragen
urls = [
    "http://localhost:9000/newGame/2",
    "http://localhost:9000/turn/A",
    "http://localhost:9000/go/1"
]

# Durchlaufe die URLs und sende GET-Anfragen
for url in urls:
    print("\n----------------------")
    try:
        response = requests.get(url)
        response.raise_for_status()  # Wirft eine Exception, wenn der Statuscode nicht erfolgreich ist (>= 400)
        print(f"Erfolgreiche Anfrage an {url}")
        print("Antwort:")
        print(response.text)  # Hier kannst du die Antwort ausgeben oder weiterverarbeiten
    except requests.exceptions.RequestException as e:
        print(f"Fehler bei der Anfrage an {url}: {str(e)}")
        break  # Stoppe das Skript, wenn eine Anfrage fehlschlägt
