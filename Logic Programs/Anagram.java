// Check whether two strings are anagram or not
// an anagram of a string is another string that contains the same chraecteres of other string,only the order of charcters can be different.
//e.g: "abcd" and "dabc" are an anagram of each other

import java.lang.*;
import java.util.*;

class Anagram {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = sobj.nextLine();

        System.out.println("Enter second string");
        String str2 = sobj.nextLine();

        MyString mobj = new MyString();
        boolean bret = mobj.CheckAnagram(str1, str2);
        if (bret == true) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("Strings are not anagram");
        }
    }
}

class MyString {
    boolean CheckAnagram(String str1, String str2) {
        // Fileter to check the length of string
        if (str1.length() != str2.length()) {
            return false;
        }

        // Step 1
        // Convert string to character array
        char arr[] = str1.toCharArray();
        char brr[] = str2.toCharArray();

        // Step 2
        // Sort that character array
        Arrays.sort(arr);
        Arrays.sort(brr);

        // Step 3
        // Convert characetr array to string
        String s1 = new String(arr);
        String s2 = new String(brr);

        System.out.println("first string " + s1);
        System.out.println("second string " + s2);

        // Step 4
        // Compare the strings
        boolean bret = s1.equals(s2);

        return bret;
    }
}
