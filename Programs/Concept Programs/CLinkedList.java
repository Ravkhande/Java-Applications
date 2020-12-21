
import java.lang.*;
import java.io.*;
import java.util.*;

class Demo {
    public static void main(String arg[]) throws Exception {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("First");
        ll.add("Second");
        ll.add("Third");

        System.out.println("\n elements in linkedlist is :" + ll);

        ll.addFirst("Six");

        ll.add(3, "New"); // we can inert the element at specified position

        ll.removeFirst();

        ll.add("NULL");

        ll.removeLast();

        ll.set(3, "New_Data");

        ll.remove(3);

        System.out.println("First occurance of element is : \t" + ll.indexOf("First"));

        System.out.println("Last occurance of element is : \t" + ll.lastIndexOf("First"));

        System.out.println("\n Number of elements in linked list is :" + ll.size());

        System.out.println("Iterarting the linkede list");
        Iterator it = ll.iterator();

        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }

        ll.clear();

    }
}