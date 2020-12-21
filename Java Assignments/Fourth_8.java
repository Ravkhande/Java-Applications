
/* Write a program which accept number from user and display its table.
Input : 2 
Output : 2 4 6 8 10 12 14 16 18 20
Input : 5
Output : 5 10 15 20 25 30 35 40 45 50
Input : -5
Output : 5 10 15 20 25 30 35 40 45 50
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
		  
		  for(int i=1;i<=10;i++)
		  {
			  System.out.print(iNo*i+"\t");
		  }
		 
		}
		
	
	}
		
class Fourth_8
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

