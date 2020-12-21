// Accept number from user and display number of elements from the fibonascci 
// series till that number

// Input : 40
// Output : 0	1	1	2	3	5	8	13	21	34

// Input	100
// Output : 0	1	1	2	3	5	8	13	21	34	55	89

import java.lang.*;
import java.util.*;

class Numbers
{
	void FibSeries(int iNo)		// 10
	{
		int First = 0, Second = 1, Third = 0;
		System.out.println();

		for( ; First <= iNo; )	// while(First <= iNo)
		{
			System.out.println(First+"\t");
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

