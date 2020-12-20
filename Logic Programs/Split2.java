// Accept string from user and count the frequency of "Marvellous" word.

// Input : Hello World Marvellous Demo Pune Marvellous
// Output : 2

import java.lang.*;
import java.util.*;

class Split2
 {
    public static void main(String arg[]) {
        try {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter first string");
            String str = sobj.nextLine();

            MyString mobj = new MyString();

            int iret = mobj.CountWords(str);

            System.out.println("Strings contains " + iret + " times Marvellous words");

        } catch (Exception obj) {
        }
    }
}

class MyString {
    int CountWords(String str) throws Exception {
        String arr[] = str.split(" ");

        int icnt = 0;

        for (String s : arr) {
            if (s.equals("Marvellous")) {
                icnt++;
            }
        }

        return icnt;
    }
}
