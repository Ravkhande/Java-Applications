
import java.lang.*;
import java.io.*;
import java.util.*;

class Collection_arraylist {
    public static void main(String arg[]) {
        ArrayList<String> al = new ArrayList<String>();

        // it is used to insert the element in the ArrayList
        al.add("First");
        al.add("Second");
        al.add("Third");

        System.out.println("\nArrayList elements are:\n" + al);

        al.add(3, "new"); // if we give first parameter as integer then it is considered
                          // as position at
                          // which we want to insert my element

        al.add("Two"); // add method is used to insert the element in end of arraylist

        al.set(3, "New_Data"); // we can replace the element from specified position

        al.remove(3); // we can remove elemrnt from any specified position

        System.out.println("Number of elements from array List is :" + al.size());

        System.out.println("First occurancce of element from array list isis :" + al.indexOf("Third"));

        System.out.println("Last occurancce of element from array list isis :" + al.lastIndexOf("Third"));

        System.out.println("Interating the arraylist");
        Iterator it = al.iterator();

        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }

        al.clear(); // we can remove all element from arraylist

    }
}