// Accept string from user display the word having largest length.

// Input : Hello World Marvellous Demo Pune Demo
// Output : Marvellous 10 

import java.lang.*;
import java.util.*;

class LargelenStr
 {
    public static void main(String arg[]) {
        try {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter string");
            String str = sobj.nextLine();

            MyString mobj = new MyString();

            mobj.MaxWord(str);
        } catch (Exception obj) {
        }
    }
}

class MyString {
    void MaxWord(String str) throws Exception {
        String arr[] = str.split(" ");

        int iMax = 0;
        String temp = null;

        for (String s : arr) {
            if (s.length() > iMax) {
                iMax = s.length();
                temp = s;
            }
        }

        System.out.println("Largest word : " + temp + " with length " + iMax);

    }
}
