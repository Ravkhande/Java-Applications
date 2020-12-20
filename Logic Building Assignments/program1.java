
/* Write Java program which accept N numbers from user and return
difference between summation of even elements and summation of
odd elements.

Input : N : 6
 Elements : 85 66 3 80 93 88
Output : 53 (234 - 181) 
*/

import java.lang.*;
import java.util.*;

class ArrayDemo
{
 public int Difference(int Arr[])
 {
	 int iEvenSum=0,iOddSum=0;
	 
	 for(int i=0;i<Arr.length;i++)
	 {
		 if((Arr[i]%2)==0)
		 {
			 
		 iEvenSum=iEvenSum+Arr[i];
		 }
		 else if((Arr[i]%2)!=0)
		 {
			 iOddSum=iOddSum+Arr[i];
		 }
	 }
	 
	 return(iEvenSum-iOddSum);
	 
 }
} 

class First
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
		
		int iRes=aobj.Difference(arr);
		System.out.println("Difference between summation of even elements and summation of odd elements is:\t"+iRes);
		
	}
}
		
			
		
	

