# Server Health Monitoring

Un'applicazione Spring Boot che monitora la salute del server. Utilizza **Spring Actuator** per esporre gli endpoint di monitoraggio e consente di ottenere informazioni sulla salute e lo stato dell'applicazione.

## Funzionalità

- **Monitoraggio della salute del server**: Esposizione dello stato di salute dell'applicazione tramite un endpoint personalizzato.
- **Spring Actuator**: Usa Spring Actuator per esporre gli endpoint di monitoraggio predefiniti, come `health` e `info`.
- **Configurazione personalizzabile**: È possibile estendere facilmente il monitoraggio per includere altre metriche come l'utilizzo della CPU, della memoria e altre risorse del sistema.

## Tecnologie

- Java 11 (o superiore)
- Spring Boot 2.x
- Spring Actuator
- Maven

## Requisiti

- Java 11 o superiore
- Maven (per la gestione delle dipendenze e la compilazione del progetto)

## Installazione

1. **Clona il repository**:

   ```bash
   git clone https://github.com/tuo-utente/server-health-monitoring.git

    Naviga nella cartella del progetto:

cd server-health-monitoring

Compila il progetto (opzionale, se hai Maven installato):

mvn clean install

Avvia l'applicazione:

    mvn spring-boot:run

    Oppure esegui il file ServerHealthMonitoringApplication.java dal tuo IDE come applicazione Java.

Endpoints

    Stato di salute personalizzato:
        URL: http://localhost:8080/server-health
        Metodo: GET
        Descrizione: Restituisce lo stato di salute del server personalizzato.

    Esempio di risposta:

"Server is running on port 8080 and is healthy!"

Stato di salute predefinito (Spring Actuator):

    URL: http://localhost:8080/actuator/health
    Metodo: GET
    Descrizione: Restituisce lo stato di salute dell'applicazione secondo le configurazioni di Spring Actuator.

Esempio di risposta:

{
  "status": "UP"
}

Informazioni sull'applicazione (Spring Actuator):

    URL: http://localhost:8080/actuator/info
    Metodo: GET
    Descrizione: Restituisce informazioni sull'applicazione, come la versione e altre informazioni personalizzate.

Esempio di risposta:

    {
      "app": {
        "name": "server-health-monitoring",
        "version": "1.0.0"
      }
    }

Configurazione
application.properties

Il file src/main/resources/application.properties contiene la configurazione dell'applicazione:

server.port=8080
management.endpoints.web.exposure.include=health,info

    server.port: Configura la porta su cui l'applicazione sarà in ascolto.
    management.endpoints.web.exposure.include: Esponi gli endpoint di health e info di Spring Actuator.

Test

Puoi testare l'applicazione eseguendo i seguenti comandi curl nel terminale:

    Verifica lo stato di salute personalizzato:

curl http://localhost:8080/server-health

Verifica lo stato di salute dell'applicazione tramite Actuator:

curl http://localhost:8080/actuator/health

Verifica le informazioni sull'applicazione tramite Actuator:

    curl http://localhost:8080/actuator/info

Estensioni future

Questo progetto può essere facilmente esteso per includere altre metriche e monitoraggi:

    CPU e Memoria: Monitoraggio dell'utilizzo della CPU e della memoria del server.
    Carico del sistema: Monitoraggio del carico del sistema e dei processi in esecuzione.
    Altri endpoint di Actuator: Configurazione di endpoint aggiuntivi come metrics, env, ecc.

Contribuire

Le contribuzioni sono benvenute! Se desideri aggiungere nuove funzionalità o correggere bug, sentiti libero di aprire una pull request.
Licenza

Distribuito sotto la licenza MIT. Vedi il file LICENSE per ulteriori dettagli.


Questo `README.md` fornisce una panoramica completa del progetto, incluse le istruzioni di installazione, l'uso degli endpoint, la configurazione e le informazioni per contribuire al progetto.

