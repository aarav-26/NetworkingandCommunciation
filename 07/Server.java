import java.io.*;
import java.net.*;

public class Server
{
    private static final int PORT = 8080;
    private static final int MAX_BUFFER_SIZE = 1024;

    public static void main(String[] args)
    {
        try
        {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server started. Listening on port " + PORT);

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = in.readLine();
            System.out.println("Received message from client: " + message);

            clientSocket.close();
            serverSocket.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
