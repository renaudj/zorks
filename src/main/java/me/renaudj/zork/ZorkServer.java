package me.renaudj.zork;

import java.io.IOException;
import java.net.ServerSocket;

public class ZorkServer {
  public ServerSocket serverSocket;
  
  public ZorkServer(){
    start();
  }
  
  public static void main(String[] args){
    new ZorkServer();
  }
  
  public void start(){
    try {
        serverSocket = new ServerSocket(5000);
      
    } catch (IOException e) {
        e.printStackTrace();
    }
  }
}
