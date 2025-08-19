working with generic options or modules included
import java.net.*;
import javax.sound.sampled.SourceDataLine;
import java.io.*;class Server{

ServerSocket server;
Socket socket;

BufferedReader br;
PrintWriter out;

 public Server(){
      try{server = new ServerSocket(7777);
        System.out.println("Server is ready to accept connection");
        System.out.println("waiting...");
        socket=server.accept();
        
        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        out = new PrintWriter(socket.getOutputStream());

        startReading();
        startWriting();
		#feature101 changes by vivek on Reports Module on Oct2024
		 public void display1() {
    System.out.println("Method without parameter");
  }

  // method with single parameter
  public void display2(int a) {
    System.out.println("Method with a single parameter: " + a);
  }

  public static void main(String[] args) {
    
    // create an object of Main
    Main obj = new Main();

    // calling method with no parameter
    obj.display1();
    
    // calling method with the single parameter
    obj.display2(24);
  }
  #end of feature101

 } catch(Exception e ){};}
