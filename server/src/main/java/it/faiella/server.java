package it.faiella;

import java.io.IOException;
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

} catch (IOException e) {
    e.printStackTrace();
}
    }
}