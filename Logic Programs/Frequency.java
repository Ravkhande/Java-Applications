
/*
Write a java program which accept string from user and print frequency
of each word.
Input : India is Demo India Hello Demo
Output : India 2
            is 1
          Demo 2
         Hello 1 

*/

import java.lang.*;
import java.util.*;

class Frequency
{
    public static void main(String args[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sobj.nextLine();

        Count cobj=new Count();
         cobj.CountWord(str);
    }
}

class Count
{
    public void CountWord(String str)
    {
        String words[]=str.split(" ");

        HashMap<String,Integer>hmobj=new HashMap<String,Integer>();

        for(String name:words)
        {
            if(hmobj.containsKey(name))
            {
                hmobj.put(name, hmobj.get(name)+1);
            }
            else
            {
                hmobj.put(name,1);
            }
        }

        System.out.println("Frequency of each words is :");
        System.out.println(hmobj);

    }
}