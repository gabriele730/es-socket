package it.faiella;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(5000)) {
   System.out.println(" client in ascolto ");

        Socket socket = server.accept();

     
       } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
       }

       
    }
}