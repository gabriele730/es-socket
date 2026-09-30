package it.faiella;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
       try (Socket sock = new Socket("localhost", 5000)) {
       } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
       }

       
    }
}