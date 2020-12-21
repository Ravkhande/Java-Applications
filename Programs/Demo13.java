
import java.util.*;

// Length = 10
// Start = 3
// End = 7

// Input
// 0	1	2	3	4	5	6	7	8	9	
// 6	5	4	3	7	8	2	3	4	3

// Output
// 0	1	2	3	4	5	6	7	8	9	
// 6	5	4	2	3	3	7	8	4	3

class Bubble
{
	public void Sort(int arr[],  int start, int end)
	{
		int pass = 0,no = 0, j = 0 , temp = 0;
		boolean flag = true;

		if((start < 0) || (start >= end) || (end > arr.length))
		{
			System.out.println("Invalid input");
			return;
		}
		// end = 5 start = 1

		for(pass = 0; pass <= (end - start) && flag == true; pass++)
		{
			no = pass+1;
			flag = false;

			for(j = start; j< end-1-pass; j++)
			{
				if(arr[j] > arr[j+1])
				{
					flag = true;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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

		System.out.println();
		System.out.println("Enter starting index");
		int start = sobj.nextInt();

		System.out.println("Enter ending index");
		int end = sobj.nextInt();

		Bubble bobj = new Bubble();
		bobj.Sort(arr,start, end);

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



/*
Array
4	3	5	7	1

Pass 1
3	4	5	7	1
3	4	5	1	7

Pass 2
3	4	5	1	7
3	4	1	5	7

Pass 3
3	4	1	5	7
3	1	4	5	7

Pass 4
3	1	4	5	7
1	3	4	5	7

*/



























