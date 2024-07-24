import java.io.*;
import java.net.*;

public class Client
{
    private static final int PORT = 8080;
    private static final String SERVER_IP = "127.0.0.1";
    private static final int MAX_BUFFER_SIZE = 1024;

    public static void main(String[] args)
    {
        try
        {
            Socket socket = new Socket(SERVER_IP, PORT);
            System.out.println("Connected to server: " + SERVER_IP + ":" + PORT);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a message to send to the server: ");
            String message = userInput.readLine();

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(message);
            System.out.println("Message sent to the server.");

            socket.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
