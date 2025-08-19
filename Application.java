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
#feature102 code changes by ethan on usermodule on october 2024
 private String formatNumber(int value) {
        return String.format("%d", value);
    }

    private String formatNumber(double value) {
        return String.format("%.3f", value);
    }

    private String formatNumber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }

    public static void main(String[] args) {
        HelperService hs = new HelperService();
        System.out.println(hs.formatNumber(500));
        System.out.println(hs.formatNumber(89.9934));
        System.out.println(hs.formatNumber("550"));
    }
}

#end of feature102
 } catch(Exception e ){};}
