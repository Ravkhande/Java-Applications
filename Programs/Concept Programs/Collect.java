
import java.lang.*;
import java.io.*;
import java.util.*;

class Collect {
    public static void main(String arg[]) throws Exception {

        int position = 0;

        Stack<Integer> st = new Stack<Integer>();

        // it is used to insert the elemnt in satck
        st.push(11);
        st.push(21);
        st.push(31);

        System.out.println("\n Contents in satck is :" + st);

        Integer element = st.pop(); // autoboxing

        System.out.println("\nPopped element is :" + element);

        position = st.search(31); // search function returns the position of the particular element

        if (position == -1) {
            System.out.println("There is no such element is present in stack:");
        }
        System.out.println("\nThere is element present in stack:" + position);

        System.out.println("\ncontents in stack:" + st);

    }
}
