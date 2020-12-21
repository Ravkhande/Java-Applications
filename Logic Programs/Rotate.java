
/*
Write a java program which accept two strings from user and check
whether first string is the rotation of second string or not.

Input : abcdefg cdefgab
Output : True 

*/

import java.lang.*;
import java.util.*;

class Rotate 
{
   public static void main(String args[])
   {
       Scanner sobj=new Scanner(System.in);
       System.out.println("Enter the first string:");
       String str1=sobj.nextLine();

       System.out.println("Enter the second string:");
       String str2=sobj.nextLine();

       Rotation robj=new Rotation();
       boolean bRet=robj.chkRotation(str1,str2);
       if(bRet==false)
       {
           System.out.println("First string is not a rotation of second string");
       }
       else
       {
           System.out.println("First string is rotation of second string");
       }

    }
    
}

class Rotation
{
    public boolean chkRotation(String str1,String str2)
    {
        String temp=str1+str1;

        if(str1.length()!=str2.length())
        {
            return false;
        }

        if(temp.contains(str2))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
