
/*
 Accept string from user and reverse the contents of that string
by toggling the case.

Input :  aCBdef
Output : FEDcbA 

*/

import java.lang.*;
import java.util.*;

class StringDemo
{
 public String StrRevTogX(String str)
 {
 	char Str[]=str.toCharArray();

 	int iStart=0,iEnd=0;
 	char temp='\0';

 	while(iEnd<Str.length)
 	{
 		iEnd++;
 	}

 	iEnd--;
     
     while(iStart<iEnd)
     {
     	temp=Str[iStart];
     	Str[iStart]=Str[iEnd];
     	Str[iEnd]=temp;
     	iStart++;
     	iEnd--;
     }


 	 for(int i=0;i<Str.length;i++)
 	 {

 		if((Str[i]>='A') && (Str[i]<='Z'))
 		{
 			Str[i]=(char)(Str[i]+('a'-'A'));
 		}
 		else if((Str[i]>='a') && (Str[i]<='z'))
 		{
 			Str[i]=(char)(Str[i]-('a'-'A'));
 		}
 	}

     String src=String.valueOf(Str);         // it is used to convert character array to string
     return src;

 } 

}

class String4
{
	public static void main(String args[])
	{
	
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the string :");
		String str=sobj.nextLine();

        StringDemo sd=new StringDemo();

        String Res=sd.StrRevTogX(str);

         System.out.print("Reversed Toggled String is : " + Res);
         

	}
}
