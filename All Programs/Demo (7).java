// Accept number from user and display that number of elements from the fibonascci 
// series
// Input :10

//			F 	S 	T
//				F	S 	T
//					F	S 	T
//						F 	S 	T		
// Output : 0	1	1	2	3	5	8	13	21	34

// First	0
// Second	1
// Third	--

import java.lang.*;
import java.util.*;

class Numbers
{
	void FibSeries(int iNo)		// 10
	{
		int First = 0, Second = 1, Third = 0;
		System.out.println();
		for(int i = 1; i<= iNo; i++)
		{
			System.out.print(First+"\t");
			Third = First + Second;
			First = Second;
			Second = Third;
		}
	}
}
class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number");
		int ivalue = sobj.nextInt();

		Numbers nobj = new Numbers();
		nobj.FibSeries(ivalue);
	}
}

