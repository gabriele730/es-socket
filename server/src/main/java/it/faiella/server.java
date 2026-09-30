package it.faiella;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) {

        //apertura porta da parte del server 
        
       try (ServerSocket server = new ServerSocket(5000)) {
    System.out.println("Server in ascolto sulla porta 5000..."); // 1. Il server si mette in ascolto

    Socket socket = server.accept(); // 2. Il server si ferma qui e aspetta il client
    
    // 3. Questa riga verrà stampata SOLO quando il client si connette davvero:
    System.out.println("Connessione accettata da un client!"); 

 // Stream per leggere il messaggio dal client
           BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
           // Stream per inviare la risposta al client
           PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

           // 1. Legge il messaggio inviato dal client
           String messaggioRicevuto = in.readLine();
           System.out.println("Ricevuto dal client: " + messaggioRicevuto);

           if (messaggioRicevuto != null) {
               // 2. Converte il messaggio ricevuto in maiuscolo
               String messaggioMaiuscolo = messaggioRicevuto.toUpperCase();
               
               // 3. Invia la risposta al client
               out.println(messaggioMaiuscolo);
               System.out.println("Risposta in maiuscolo inviata al client.");
           }
     
           // La connessione e il server si chiudono automaticamente qui
           System.out.println("Chiusura connessione e spegnimento server.");
















} catch (IOException e) {
    e.printStackTrace();
}
    }
}