//Not done
/* 
Write a java program which accepts 2 strings from user and
concat N characters of second string after first string.Value of N
should be accepted from user.

Note : If third parameter is greater than the size of second string
then concat whole string after first string.

Input : Marvellous Infosystems
         Logic Building
               5
			   
Output : Marvellous Infosystems Logic

*/

import java.lang.*;
import java.util.*;


class StringDemo
{
  public void StrNCatX(String src,String dest,int iCnt)
  {
    char Arr[]=src.toCharArray();
	char Brr[]=dest.toCharArray();
	
	int i=0;

    while(i<Arr.length-1)
    {
    	System.out.print(Arr[i]);
    	i++;
    }
     
     Arr[i]=' ';
     System.out.print(Arr[i]);

	for(int j=0;(j<Brr.length) && (iCnt!=0);j++)
	{

         System.out.print(Brr[j]);
         iCnt--;
	}
       

	}

  }
 
  
class First
{ 
  public static void main(String args[])
  {
     Scanner sobj=new Scanner(System.in);

	 System.out.println("enter the string 1");
	 String str=sobj.nextLine();

	 System.out.println("enter the string 2");
	 String strs=sobj.nextLine();

	 System.out.println("enter the value");
	 int Value=sobj.nextInt();

	 StringDemo ss=new StringDemo();

	 ss.StrNCatX(str,strs,Value);

	
  }

 
}


