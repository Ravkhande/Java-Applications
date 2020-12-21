
/*  Write a program which accept number from user and if number is less than 50
then print small , if it is greater than 50 and less than 100 then print medium, if it is
greater than 100 then print large.

Input : 75
Output : Medium 
*/

import java.lang.*;
import java.util.*;

class Demo
{
	
	public void Number(int iNo)
	{
		if(iNo<0)
		{
			iNo=-iNo;
		}
			if(iNo<50)
			{
				System.out.println("Small");
			}
			else if(iNo>50 && iNo<100)
			{
				System.out.println("Medium");
			}
			else
			{
				System.out.println("Large");
			}
			
		}
		
	
	}
		
class First_8
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sobj.nextInt();
		
		Demo dobj=new Demo();
		
		dobj.Number(no);
	}
}
