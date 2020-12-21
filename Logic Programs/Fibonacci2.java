/*
// Accept number from user and display number of elements from the fibonascci 
// series till that number

// Input : 40
// Output : 0	1	1	2	3	5	8	13	21	34

// Input	100
// Output : 0	1	1	2	3	5	8	13	21	34	55	89

*/

import java.lang.*;
import java.util.*;

class Demo
{
	public void series(int iNo)
	{
		int First=0,Second=1,Third=0;
		System.out.println("Fibonacci series till that number is :");
		
            while(First<=iNo)
			{
				
			System.out.print(First+"\t");
			
			Third=First+Second;
			First=Second;
			Second=Third;
			}
		
	}
	
}

class Fibonacci2
{
	public static void main(String args[])
	{
		Demo dobj=new Demo();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the number");
		int value=sobj.nextInt();
		
	    dobj.series(value);
		
	}
}

		