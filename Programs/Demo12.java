// Singly linked list creation in java
import java.lang.*;
import java.util.*;

class Bubble
{
	public void Sort(int arr[], int type)
	{
		int pass = 0,no = 0, j = 0 , temp = 0;
		boolean flag = true;

		if(type == 1)
		{
			for(pass = 0; pass < arr.length && flag == true; pass++)
			{
				no = pass+1;
				flag = false;

				System.out.println("Inside Pass : "+ no);
				// arr.length 				5
				// arr.length-1				4
				// arr.length-1-i			4	3	2	1
				for(j = 0; j< arr.length-1-pass; j++)
				{
					if(arr[j] > arr[j+1])
					{
						flag = true;
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
				System.out.println("Array after pass : "+ no);
				for(int k = 0; k < arr.length; k++)
				{
					System.out.print(arr[k]+"\t");
				}
				System.out.println();
			}
		}
		else if(type == 2)
		{
			for(pass = 0; pass < arr.length && flag == true; pass++)
			{
				no = pass+1;
				flag = false;

				System.out.println("Inside Pass : "+ no);
				// arr.length 				5
				// arr.length-1				4
				// arr.length-1-i			4	3	2	1
				for(j = 0; j< arr.length-1-pass; j++)
				{
					if(arr[j] < arr[j+1])
					{
						flag = true;
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
				System.out.println("Array after pass : "+ no);
				for(int k = 0; k < arr.length; k++)
				{
					System.out.print(arr[k]+"\t");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Wrong option");
		}
	}
}

class Demo
{
	public static void main(String arg[]) throws Exception
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sobj.nextInt();

		int arr[] = new int[size];

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

		System.out.println("Enter the option for sorting");
		System.out.println("1 : Incrasing order");
		System.out.println("2 : Decreasing order");

		int option = sobj.nextInt();

		Bubble bobj = new Bubble();
		bobj.Sort(arr,option);

		System.out.println("Array after complete sorting : ");
		for(int i = 0; i < arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}







/*



	Array length is 6 (Index : 0 to 5)

	Pass 		Iterations of inner loop (j < lenth-1-pass)
	
	0			6-1-0	5	
	1			6-1-1	4
	2			6-1-2	3
	3			6-1-3	2
	4			6-1-4	1

	




*/


















