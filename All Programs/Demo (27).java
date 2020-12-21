import java.lang.*;
import java.util.*;

class Insertion
{
	public void Sort(int arr[])
	{
		int pass = 0, key = 0, j = 0;

		for(pass = 1; pass < arr.length; pass++)
		{
			key = arr[pass];
			j = pass-1;

			while((j>=0) && (arr[j] > key))
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
}

class Demo
{
	public static void main(String arg[]) throws Exception
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the number elements");
		int size = sobj.nextInt();

		int arr[] = new int [size];
		System.out.println("Enter the values");
		for(int i = 0; i < arr.length; i++)
		{
				arr[i] = sobj.nextInt();	
		}

		System.out.println("Enterred data is : ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+"\t");	
		}

		System.out.println();

		Insertion iobj = new Insertion();
		iobj.Sort(arr);

		System.out.println("Array after complete sorting : ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+"\t");	
		}

		System.out.println();
	}
}





























