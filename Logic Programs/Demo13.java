

import java.lang.*;
import java.util.*;

class Array
{
	int Nearest(int Arr[],int iNo)
	{
		
		System.out.println("Elements are:");
		for(int i=0;i<Arr.length;i++)
		{
			
			
				
		}
		
	}
	
}

class Demo13
{
	public static void main(String args[])
	{
		Array aobj=new Array();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int size=sobj.nextInt();
		
		int arr[]=new int[size];
		
		 System.out.println("Enter elements");
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sobj.nextInt();
		 }	 
		 
		 System.out.println("Enter the number");
		 int value=sobj.nextInt();
		 
	     int iRes=aobj.Display(arr,value);
		 System.out.println("Nearest number is:"+iRes);
		
	}
}
	
