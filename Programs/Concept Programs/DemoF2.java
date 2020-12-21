import java.io.*;

class DemoF2 {
    public static void main(String args[]) throws Exception {

        FileReader fr = new FileReader("f1.txt");
        int i = 0;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();

    }
}