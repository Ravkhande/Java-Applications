
/* // Accept number from user and display that number of elements from the fibonascci 
// series
// Input :10

//			F 	S 	T
//				F	S 	T
//					F	S 	T
//						F 	S 	T		
// Output : 0	1	1	2	3	5	8	13	21	34

*/

import java.lang.*;
import java.util.*;

class Demo
{
	public void series(int iNo)
	{
		int First=0,Second=1,Third=0;
		int i=1;
		System.out.println("Fibonacci series is");
		
		while(i<=iNo)
		{
			System.out.print(First+"\t");
			
			Third=First+Second;
			First=Second;
			Second=Third;
			i++;
		}
	}
	
}

class Fibonacci
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

		