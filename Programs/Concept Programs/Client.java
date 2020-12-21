
import java.io.*;
import java.net.*;

class Client {
    public static void main(String srg[]) throws Exception {
        System.out.println("Client is running...");

        Socket s = new Socket("localhost", 2101); // 2101 is port number, and localhost means on the same machine

        System.out.println("Connection is Established..");

        DataOutputStream d = new DataOutputStream(s.getOutputStream()); // output to server

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream())); // Input from server

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)); // Input from keyboard

        String str1, str2;

        while (!(str1 = br2.readLine()).equals("exit")) {
            d.writeBytes(str1 + "\n");
            str2 = br1.readLine();
            System.out.println(str2);
        }

    }

}