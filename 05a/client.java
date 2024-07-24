import java.io.*;
import java.net.*;
import java.util.*;

class client {
    public static void main(String[] args) throws Exception 
    {
        String str;
        int c = 0;
        long t1, t2;
        
        //localhost connect to server
        Socket s = new Socket("localhost", 5555);
        
        //input strea to read fro server
        DataInputStream dis = new DataInputStream(s.getInputStream());
        
        //output stream send to server
        PrintStream out1 = new PrintStream(s.getOutputStream());
        
        
        while (c < 4) 
        {
            t1 = System.currentTimeMillis();
            str = "Welcome to networks";
            
            out1.println(str);//sending message to server
            
            System.out.println(dis.readLine());//getting response
            
            t2 = System.currentTimeMillis();
            
            
            System.out.println("TLL : " + (t2 - t1) + "ms");
            c++;
        }
        s.close();
    }
}
