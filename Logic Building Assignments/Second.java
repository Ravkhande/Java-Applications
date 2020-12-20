
/* Write Java program which accept N numbers from user and display
all such elements which are divisible by 5.

Input : N : 6
 Elements : 85 66 3 80 93 88
Output : 85 80 
*/

import java.lang.*;
import java.util.*;

class ArrayDemo
{
 public void Display(int Arr[])
 {
    for(int i=0;i<Arr.length;i++)
	{
		if((Arr[i]%5)==0)
		{
			
			System.out.print("\n"+Arr[i]+"\t");
		}
	}
 }
} 

class Second
{
	public static void main(String args[])
	{
		ArrayDemo aobj=new ArrayDemo();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the N value");
		int N=sobj.nextInt();
		
		int arr[]=new int[N];
		
		System.out.println("Enter the N elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}
		
		aobj.Display(arr);
		
	}
}