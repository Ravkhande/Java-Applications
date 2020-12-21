import java.io.*;

class DemoF1 {
    public static void main(String args[]) throws Exception {

        FileWriter fw = new FileWriter("f1.txt");
        fw.write("Educating for better tomorrow");
        fw.close();

    }
}