
/* 
Write a program which accept number from user and display its table in reverse
order.
Input : 2
Output : 20 18 16 14 12 10 8 6 4 2
Input : 5
Output : 50 45 40 35 30 25 20 15 10 5
Input : -5
Output : 50 45 40 35 30 25 20 15 10 5
*/

import java.lang.*;
import java.util.*;

class Demo
{
	
	public void Table(int iNo)
	{
		
		if(iNo<0)
		{
			iNo=-iNo;
		}
		  
		  for(int i=10;i>=1;i--)
		  {
			  System.out.print(iNo*i+"\t");
		  }
		 
		}
		
	
	}
		
class Fifth_8
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int no=sobj.nextInt();
		
		Demo dobj=new Demo();
		
		dobj.Table(no);
		
		
		
	}
}

