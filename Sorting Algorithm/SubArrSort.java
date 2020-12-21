
// Length = 10
// Start = 3
// End = 7

// Input
// 0	1	2	3	4	5	6	7	8	9	
// 6	5	4	3	7	8	2	3	4	3

// Output
// 0	1	2	3	4	5	6	7	8	9	
// 6	5	4	2	3	3	7	8	4	3


import java.lang.*;
import java.util.*;

class Display
{
	public void Sort(int Arr[],int value,int Start,int End)
	{
		boolean flag=true;

		if((Start<=0) || (Start>End) || (End<=0))
		{
			System.out.println("Invalid input");
			return;
		}
		    switch(value)
		    {
		 case 1: 
		for(int pass=0; pass<=(End-Start) && flag==true ;pass++)
		{
			int no=pass+1;
			flag=false;
			System.out.println("\nPass : " + no);
			for(int j=Start; j<End-pass ;j++)
			{
				if(Arr[j]>Arr[j+1])
				{
					flag=true;
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
		for(int pass=0; pass<=(End-Start) && flag==true ;pass++)
		{
			int no=pass+1;
			flag=false;
			System.out.println("\nPass : " + no);
			for(int j=Start; j<End-pass ;j++)
			{
				if(Arr[j]<Arr[j+1])
				{
					flag=true;
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


	}

}

class SubArrSort
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

         System.out.println("\nEnter the starting range");
         int start=sobj.nextInt();

         System.out.println("\nEnter the Ending range");
         int end=sobj.nextInt();

         System.out.println("\nEnter in which order Sorting Perform : ");
         System.out.println("__________________________________________");
         System.out.println(" 1: Ascending order");
         System.out.println(" 2: Descending order");
         System.out.println("__________________________________________");
         int choice=sobj.nextInt();

		dobj.Sort(arr,choice,start,end);
		System.out.println("\nElements of array after complete sorting :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}

	}
}
