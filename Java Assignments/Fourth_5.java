
/* Write a program which accept three numbers and print its multiplication.

 Input : 5 4 7
 Output : 140
 Input : 5 0 7
 Output : 35
 Input : 5 0 0
 Output : 5
 Input : 0 0 0
 Output : 0 

*/

import java.lang.*;
import java.io.*;

class Demo
{
	public int Print(int iNo1,int iNo2,int iNo3)
	{
		if(iNo1<0)
		{
			iNo1=-iNo1;
		}
		if(iNo2<0)
		{
			iNo2=-iNo2;
		}
		if(iNo3<0)
		{
			iNo3=-iNo3;
		}
		
		if(iNo1==0 && iNo2==0 && iNo3==0)
		{
			return 0;
		}
		
		if(iNo1==0)
		{
			iNo1=1;
			
		}
		if(iNo2==0)
		{
			iNo2=1;
			
		}
		if(iNo3==0)
		{
			iNo3=1;
			
		}
		return(iNo1*iNo2*iNo3);	
	}
}

class Fourth_5
{
	public static void main(String arg[]) throws Exception
	{
		InputStreamReader iobj=new InputStreamReader(System.in);
		BufferedReader bobj=new BufferedReader(iobj);
		
		System.out.println("Enter the first number");
		int no1=Integer.parseInt(bobj.readLine());
		
		System.out.println("Enter the second number");
		int no2=Integer.parseInt(bobj.readLine());
		
		System.out.println("Enter the third number");
		int no3=Integer.parseInt(bobj.readLine());
	
		Demo dobj=new Demo();
		
		int iRes=dobj.Print(no1,no2,no3);
		
		System.out.println("multiplication of three numbers are:\t"+ iRes);
			
	}
}	