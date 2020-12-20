
/*
Write a program which 2 strings from user and check whether
contents of two strings are equal or not.
Input : 
 Marvellous Infosystems
 Marvellous Infosystems
Output : TRUE

*/

import java.lang.*;
import java.util.*;

class StringDemo
{
 public boolean StrCmpX(String src, String dest)
 { 
 	char Src[]=src.toCharArray();
 	char Dest[]=dest.toCharArray();

      int i=0,j=0;
        
        while((i<Src.length) && (j<Dest.length))
        {

       if(Src[i]==Dest[j])
       {
       	i++;
       	j++;
       	 
       } 
       else
       {
            break;
       }
 	
 	}

 	if((Src==Dest) || (i==Src.length && j==Dest.length))
 	{
 		return true;
 	}
 	else
 	{
 		return false;
 	}

 }
}


class Second
{
	public static void main(String args[])
	{
		boolean bRet=false;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the first string :");
		String str1=sobj.nextLine();

		System.out.println("Enter the Second string :");
		String str2=sobj.nextLine();

        StringDemo sd=new StringDemo();

        bRet=sd.StrCmpX(str1,str2);
        if(bRet==true)
        {
        	System.out.println("Both strings are equal");
        }
        else
        {
        	System.out.println("Both strings are not equal");
        }

	}
}