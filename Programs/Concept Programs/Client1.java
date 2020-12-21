import java.lang.*;
import java.io.*;
import java.net.*;

class Client1 {
    public static void main(String arg[]) throws Exception {
        System.out.println("Client is running\n");

        Socket s = new Socket("localhost", 4101);

        System.out.println("Connection is Established...");

        DataOutputStream d = new DataOutputStream(s.getOutputStream()); // client sends data to server

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream())); // client accept data from
                                                                                            // the server

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)); // client accept data from the
                                                                                   // keyboard

        String str1, str2;

        while (!(str1 = br2.readLine()).equals("exit")) // keyboard kadhun input ghya jo paranthe client exit enter nahi
                                                        // karat tho paranthe
        {
            d.writeBytes(str1 + "\n"); // to send or write the data to the server
            str2 = br1.readLine(); // to accept the data from the server
            System.out.println(str2 + "\n"); // to display the data from the server

        }

    }
}