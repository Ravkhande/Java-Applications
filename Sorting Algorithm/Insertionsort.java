
// Insertion sort implementation in java


import java.lang.*;
import java.util.*;

class Display
{
	public int[] Sort(int Arr[],int Size)
	{
	     int i=0,j=0,Key=0;
	   for(i=1;i<Size;i++)
	   {
	         Key=Arr[i];
	         j=i-1;

	         while(j>=0 && Arr[j]>Key)
	         {
	         	Arr[j+1]=Arr[j];
	         	j=j-1;
	         }

	         Arr[j+1]=Key;	

	   	}

	   return Arr;

      }

}

class Insertionsort
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		Display dobj=new Display();
		System.out.println("Enter the size of array:");
		int size=sobj.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter the elements of array :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sobj.nextInt();
		}

		System.out.println("Elements of array before Sorting :");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"\t");
		}

		System.out.println();
     
		int Arr[]=dobj.Sort(arr,size);

		System.out.println("Elements of array after Sorting :");
		for(int i=0;i<size;i++)
		{
			System.out.print(Arr[i]+"\t");
		}

	}
}

