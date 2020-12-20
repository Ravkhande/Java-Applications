




import java.lang.*;
import java.util.*;

class Array
{
	void DisplayLucky(int Arr[])
	{
		
		System.out.println("Elements are:");
		for(int i=1;i<Arr.length-1;i++)
		{
			
			if(Arr[i]==(Arr[i-1]+Arr[i+1]))
			{
               System.out.println("Lucky numbers are:");
			System.out.println(Arr[i]+"="+Arr[i-1]+"+"+Arr[i+1]);
			}
				
		}
		
	}
	
}

class Demo12
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
	     aobj.DisplayLucky(arr);
		
	}
}
	
