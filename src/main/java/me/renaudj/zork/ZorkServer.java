package me.renaudj.zork;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ZorkServer {
  public ServerSocket serverSocket;
  public boolean running = false;
  
  public ZorkServer(){
    start();
  }
  
  public static void main(String[] args){
    new ZorkServer();
  }
  
  public void start(){
    try {
        serverSocket = new ServerSocket(5000);
      running = true;
      	while(running){
           Socket socket = serverSocket.accept();
           System.out.println("Connection made!");
         }
    } catch (IOException e) {
        e.printStackTrace();
    }
  }
}
