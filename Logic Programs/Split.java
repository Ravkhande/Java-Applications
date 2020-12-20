// Accept string from user and count number of words from that string

// Input : Hello World india Demo
// Output : 4

import java.lang.*;
import java.util.*;

class Split {
    public static void main(String arg[]) {
        try {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter first string");
            String str = sobj.nextLine();

            MyString mobj = new MyString();

            int iret = mobj.CountWords(str);

            System.out.println("Strings contains " + iret + " words");

        } catch (Exception obj) {
        }
    }
}

class MyString {
    int CountWords(String str) throws Exception {

        return ((str.split(" ")).length);
    }
}

// String arr[] = str.split(" ");
// String arr[]= "Hello World india Demo"
// arr[0]=Hello
// arr[1]=World
// arr[2]=india
// arr[3]=Demo
// arr.length=4
