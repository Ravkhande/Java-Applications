// Not done for All test cases
/*
 Accept string from user and check whether the string is
palindrome or not without considering its case.

Input : 1abccBA1
Output : TRUE 

*/


import java.lang.*;
import java.util.*;


class StringDemo
{
 public boolean StrPallindrome(String str)
 {
         char Str[]=str.toCharArray();

          int size=Str.length;

         char Ctemp='\0';

         int iStart=0,iEnd=0;

         for(int i=0;i<size;i++)
         {
         	if(Str[i]>='A' && Str[i]<='Z')
         	{
         		Str[i]=(char)(Str[i]+('a'-'A'));
         	}
         }

         char brr[]=Str;

         while(iEnd<size)
         {
         	iEnd++;
         }

         iEnd--;

         while(iStart<iEnd)
         {
         	Ctemp=Str[iStart];
         	Str[iStart]=Str[iEnd];
         	Str[iEnd]=Ctemp;

         	iStart++;
         	iEnd--;
         }

       char temp[]=Str;

         if(brr!=temp)
         {
         	return false;
         }
         else
         {
         	return true;
         }
         
 }

  
}


class String5
{
	public static void main(String args[])
	{
	    boolean bRet=false;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the string :");
		String str=sobj.nextLine();

        StringDemo sd=new StringDemo();

        bRet=sd.StrPallindrome(str);
           if(bRet==true)
           {

           	  System.out.println("String is Pallindrome");
      
           }
           else
           {
                System.out.println("String is not Pallindrome");
           }

	}
}
