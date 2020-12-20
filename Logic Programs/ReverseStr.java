// Accept string from user reverse each word of string

// Input : Hello World Demo
// Output : olleH dlroW omeD 

import java.lang.*;
import java.util.*;

class ReverseStr {
    public static void main(String arg[]) {
        try {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter string");
            String str = sobj.nextLine();

            MyString mobj = new MyString();

            mobj.WordReverse(str);
        } catch (Exception obj) {
        }
    }
}

class MyString {
    void WordReverse(String str) throws Exception {
        String arr[] = str.split(" ");

        StringBuilder newstr = new StringBuilder();

        for (String s : arr) {
            StringBuilder sb = new StringBuilder(s);
            String temp = sb.reverse().toString();
            newstr.append(temp + " ");
        }

        System.out.println("Updated string is " + newstr);

    }
}
