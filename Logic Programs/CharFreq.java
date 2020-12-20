// Display frequency of each letter from string

// Input : Hello

// Output : H 1
//			e 1
//			l 2
//			o 1

import java.lang.*;
import java.util.*;

class CharFreq
 {
    public static void main(String arg[]) {
        try {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter string");
            String str = sobj.nextLine();

            MyString mobj = new MyString();

            mobj.CheckFrequency(str);
        } catch (Exception obj) {
        }
    }
}

class MyString {
    void CheckFrequency(String str) throws Exception {
        // String to character array
        char arr[] = str.toCharArray();

        // HashMap <Key, Value> obj = new HashMap <Key, Value>();
        HashMap<Character, Integer> hobj = new HashMap<Character, Integer>();

        for (char c : arr) // For each loop
        {
            if (hobj.containsKey(c)) // Check whether key is there or not
            {
                hobj.put(c, hobj.get(c) + 1); // Update the key // get method returns the value of the specified key
                                              // from hashmap
            } else {
                hobj.put(c, 1); // Add new key
            }
        }

        System.out.println("Frequency of each character is :");
        System.out.println(hobj);
    }
}
