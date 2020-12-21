
import java.io.*;
import java.net.*;

class Server {
    public static void main(String arg[]) throws Exception {

        System.out.println("Server is Running...");

        ServerSocket ss = new ServerSocket(2101);

        Socket s = ss.accept();

        System.out.println("Connection is succesfully Established...");

        DataOutputStream d = new DataOutputStream(s.getOutputStream()); // output to client

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream())); // Input from client

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)); // input from keyboard

        String str1, str2;

        while ((str1 = br.readLine()) != null) {
            System.out.println(str1);
            str2 = br1.readLine();
            d.writeBytes(str2 + "\n");
        }

    }

}