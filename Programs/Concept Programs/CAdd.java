import java.lang.*;
import java.io.*;
import java.net.*;

class CAdd {
    public static void main(String arg[]) throws Exception {
        System.out.println("Client is running\n");

        Socket s = new Socket("localhost", 4101);

        System.out.println("Connection is Established...");

        DataOutputStream d = new DataOutputStream(s.getOutputStream()); // client sends data to server

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream())); // client accept data from
                                                                                            // the server

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)); // client accept data from the
             
        int a,b;
    while((a=Integer.parseInt(br2.readLine()))!=0)
    {
            Integer aobj=a;
            d.writeInt(aobj);
    }

    while((b=Integer.parseInt(br2.readLine()))!=0)
     {
            Integer bobj=b;
        
        d.writeInt(bobj);
     }

        int iRet = Integer.parseInt(br1.readLine());
        System.out.println(iRet + "\n");

    }

}
}
