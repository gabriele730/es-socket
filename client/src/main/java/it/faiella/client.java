package it.faiella;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
       try (Socket sock = new Socket("10.22.10.13", 5000)) {
        String frase="";
        System.out.println("connesso al server"); 
        
        // Crea lo scanner per leggere la tastiera dell'utente
        Scanner scan = new Scanner(System.in);
        // Crea lo stream per inviare i dati al server
        PrintWriter out = new PrintWriter(sock.getOutputStream(),true);
        // Stream per leggere la risposta dal server
        BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        do{
            
            // 1. Chiede all'utente di digitare una frase
            System.out.print("Digita una frase da inviare: ");
            frase =scan.nextLine().trim().toLowerCase();


            // 2. Invia la frase al server tramite lo stream di output
            out.println(frase);

            System.out.println("Frase inviata con successo!");

        

            // 3. Legge la risposta inviata dal server
            String risposta = in.readLine();
           
            // 4. Stampa a schermo la risposta ricevuta
            System.out.println("Risposta dal Server: " + risposta);

        }while(!frase.equals("exit"));
           
           // La socket si chiude automaticamente grazie al try-with-resources
           System.out.println("Connessione chiusa. Programma terminato.");

















       } catch (IOException e) {
        e.printStackTrace();
       }

       
       }
}