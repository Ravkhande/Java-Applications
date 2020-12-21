
import java.lang.*;
import java.io.*;
import java.net.*;

class SAdd {
    public static void main(String arg[]) throws Exception {
        System.out.println("Server is Running...");

        ServerSocket ss = new ServerSocket(4101); // create the serversocket

        Socket s = ss.accept(); // this will accept the request from client

        System.out.println("Connection is Successfully Established....");

        DataOutputStream d = new DataOutputStream(s.getOutputStream()); // from the request of client server sends the
                                                                        // output to client

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream())); // output from client is
                                                                                           // accepted by the server

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)); // server accept the input from the

        int aobj;
        int bobj;

        int iSum = 0;

        iSum = aobj + bobj;
        d.writeInt(iSum); // to send the data to the client

    }

}
