
// Bubble sort implementation in java

/*

1. Worst case time complexity =O(N^2);
2. Best case time complexity: O(N);
3. Average case time complexity : O(N^2);
4. Space complexity : O(1)  
*/

       // Not Optimised code //
 
import java.lang.*;
import java.util.*;

class Display
{
	public int[] bubbleSort(int Arr[],int value)
	{
		    switch(value)
		    {
		 case 1: 
		for(int pass=0;pass<Arr.length;pass++)
		{
			int no=pass+1;
			System.out.println("\nPass : " + no);
			for(int j=0;j<Arr.length-1-pass;j++)
			{
				if(Arr[j]>Arr[j+1])
				{
					int temp=Arr[j];
					Arr[j]=Arr[j+1];
					Arr[j+1]=temp;
				}
			}

			System.out.println("Sorted elements after pass : " + no);
			for(int k=0;k<Arr.length;k++)
			{
				System.out.print(Arr[k]+"\t");
			}

		}

		break;

		case 2:
		for(int pass=0;pass<Arr.length;pass++)
		{
			int no=pass+1;
			System.out.println("\nPass : " + no);
			for(int j=0;j<Arr.length-1-pass;j++)
			{
				if(Arr[j]<Arr[j+1])
				{
					int temp=Arr[j];
					Arr[j]=Arr[j+1];
					Arr[j+1]=temp;
				}
			}

			System.out.println("Sorted elements after pass : " + no);
			for(int k=0;k<Arr.length;k++)
			{
				System.out.print(Arr[k]+"\t");
			}

		}

		break;

		default:
			System.out.println("Wrong choice");
			break;
	}

	return Arr;

	}

}

class Bubblesort
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size=sobj.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter the elements of array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}

		System.out.println("Entered elements are :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}

         Display dobj=new Display();

         System.out.println("\nEnter in which order Sorting Perform : ");
         System.out.println("__________________________________________");
         System.out.println(" 1: Ascending order");
         System.out.println(" 2: Descending order");
         System.out.println("__________________________________________");
         int choice=sobj.nextInt();

		int Arr[]=dobj.bubbleSort(arr,choice);
		System.out.println("\nElements of array after complete sorting :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(Arr[i]+"\t");
		}

	}
}
