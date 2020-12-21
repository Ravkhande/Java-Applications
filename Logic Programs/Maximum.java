
/*
// Incomplete 

Write a java program which accept string from user and display such a
word which occurs maximum number of times.

Input : India is Demo India Hello Demo India
Output : India 

*/

import java.lang.*;
import java.util.*;

class Maximum 
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sobj.nextLine();

        Display dobj = new Display();
        dobj.Maxnumber(str);
    }
}

class Display
{
    public void Maxnumber(String str) 
    {
        String words[] = str.split(" ");

        HashMap<String, Integer> hmobj = new HashMap<String, Integer>();

        for (String name : words) 
        {
           if(hmobj.containsKey(name))
           {
               hmobj.put(name,hmobj.get(name)+1);

           }
           else
           {
               hmobj.put(name,1);
           }
        }

        for(String names:words)
        {
            int iMax=hmobj.get(names);

            if(hmobj.get(names)>iMax)
            {
                iMax=hmobj.get(names);
                String temp=hmobj.get(names,);
            }


        }

    


    }
}