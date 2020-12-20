
/* Write Java program which accept N numbers from user and display
all such elements which are even and divisible by 5. 

Input : N : 6
 Elements : 85 66 3 80 93 88
Output : 80 
*/

import java.lang.*;
import java.util.*;

class ArrayDemo
{
 public void Display(int Arr[])
 {
      for(int i=0;i<Arr.length;i++)
	  {
		  if((Arr[i]%2==0) && (Arr[i]%5==0))
		  {
			  System.out.print("\n"+Arr[i]);
		  }
	  }
 }
} 

class Third
{
	public static void main(String args[])
	{
		ArrayDemo aobj=new ArrayDemo();
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the N value");
		int N=sobj.nextInt();     // to get the size of array
		
		int arr[]=new int[N];     // allocate memory to that array according to size
		
		System.out.println("Enter the N elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}
		
		aobj.Display(arr);
	}
}
		