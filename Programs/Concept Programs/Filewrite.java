
import java.io.*;

class Filewrite {
    public static void main(String args[]) throws Exception {
        FileOutputStream fobj = new FileOutputStream("Pratiks.txt");

        System.out.println("File is created successfully");

        String s = "Hello Pratik";

        byte b[] = s.getBytes(); // converting string into byte array

        fobj.write(b);
        fobj.close();

    }
}