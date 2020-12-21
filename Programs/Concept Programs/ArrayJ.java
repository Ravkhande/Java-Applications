
import java.lang.*;

class ArrayJ {
    public static void main(String arg[]) {

        for (int i = 0; i < arg.length; i++) {
            if ((arg[i].length()) > 5) {
                System.out.println("Length is :" + arg[i].length());
            }
        }
    }

}
