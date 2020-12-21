/*
Equilibrium Index

Array [5,7,8,4,5,9,6,4,-4,9]

output : 4

*/

import java.lang.*;
import java.util.*;

class Demo
{
	public static void main(String arg[])
	{
		try
		{
			Scanner sobj = new Scanner(System.in);

			System.out.println("Enter size of array");
			int size = sobj.nextInt();

			int arr[] = new int[size];

			System.out.println("Enter the elements of array");
			for(int i = 0; i < size; i++)
			{
				arr[i] = sobj.nextInt();
			}

			MyArray mobj = new MyArray();

		 	int ret = mobj.EquilibriumIndex(arr);

		 	if(ret == -1)
		 	{
		 		System.out.println("There is no Equilibrium index");
		 	}
		 	else
		 	{
		 		System.out.println("Equilibrium index is : "+ret);		 	
			}
		}
		catch(Exception obj)
		{}
	}
}

class MyArray
{
	int EquilibriumIndex(int Arr[]) throws Exception
	{
		int TotalSum = 0;
		int PartSum = 0;
		int i = 0;

		for(i = 0;i<Arr.length;i++)
		{
			TotalSum = TotalSum + Arr[i];
		}

		for(i = 0;i<Arr.length; i++)
		{
			TotalSum = TotalSum - Arr[i];

			if(TotalSum == PartSum)
			{
				return i;
			}

			PartSum = PartSum + Arr[i];
		}

		return -1;
	}
}
































