package code.textfinder;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private Server server;
    public Server(ServerSocket serverSocket) {
        try{
            server = new Server(new ServerSocket(1234));
            System.out.println("Connected to Client!");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Error creating Server ... ");
        }


        try{
            this.serverSocket = serverSocket;
            this.socket = serverSocket.accept();
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        }catch(IOException e){
            System.out.println("Error creating Server!");
            e.printStackTrace();
            //closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }
    public static void main(String[] args) {

    }
}
