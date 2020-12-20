
/*  Write java program which accept N numbers from user and accept
Range, Display all elements from that range

Input : N : 6
 Start: 60
 End : 90
 Elements : 85 66 3 76 93 88
Output : 66 76 88

Input : N : 6
 Start: 30
 End : 50
 Elements : 85 66 3 76 93 88 

*/

import java.lang.*;
import java.util.*;

class Number
{
 public void Display(int Arr[], int iStart, int iEnd)
 {
    if(iStart>iEnd)
	{
		return;
	}
	
	if(iStart<0 || iEnd<0)       // if range is -ve
	{
		return;
	}
	
	 for(int i=0;i<Arr.length;i++)
	 {
		 if(Arr[i]>iStart && Arr[i]<iEnd)
		 {
			 System.out.print(Arr[i]+"\t");
		 }
	 }
	 
 }
} 

class Fourth
{
	public static void main(String args[])
	{
		Number nobj=new Number();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the N value");
		int N=sobj.nextInt();
		
		int arr[]=new int[N];
		
		System.out.println("Enter the N elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}
		
		System.out.println("Enter the starting range:");
		int value1=sobj.nextInt();
		
		System.out.println("Enter the Ending range:");
		int value2=sobj.nextInt();
		
		nobj.Display(arr,value1,value2);
		
		
	}
}

