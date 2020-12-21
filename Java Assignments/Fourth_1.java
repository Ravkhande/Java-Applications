
/* Accept one number and check whether is is divisible by 5 or not.  */


import java.lang.*;
import java.util.*;

class Demo
{
	public int Divide(int iNo)
	{
		if((iNo)%5==0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
		
		
}

class Fourth_1
{
	public static void main(String args[])
	{
		Demo dobj=new Demo();
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int no=sobj.nextInt();
		
		int iRes=dobj.Divide(no);
		
		if(iRes==1)
		{
			System.out.println("Number is divisible by 5");
		}
		else
		{
			System.out.println("Number is not divisible by 5");
		}
		
		
			
	}
}
		
		
		
		
		
		
		
		