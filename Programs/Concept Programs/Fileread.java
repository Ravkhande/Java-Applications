
import java.io.*;

class Fileread {
    public static void main(String args[]) throws Exception {
        FileInputStream fin = new FileInputStream("Pratiks.txt");

        int i = 0;
        while ((i = fin.read()) != -1) {
            System.out.print((char) i);
        }

        fin.close();
    }
}