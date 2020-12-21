
/*
/ Accept N numbers from user and display all lucky members from that N numbers
// Lucky member is sucha a member whose value is the addition of its neighbours.
// Input : N = 10
//	0   1	2	3	4	5	6	7	8	9
//	5	8	12	4	-8	8	10	2	2	0
//			-	-			-		-	
// Output :	12	4	10	2
*/

import java.lang.*;
import java.util.*;

class Demo
{
	public void Display(int Arr[])
	{
		System.out.println("Lucky members are:");
		for(int i=1;i<Arr.length-1;i++)
		{
			if(Arr[i]==(Arr[i-1]+Arr[i+1]))
			{
				System.out.println(Arr[i]+"="+Arr[i-1]+"+"+Arr[i+1]);
			}
		}
		
	}
	
}

class Lucky
{
	public static void main(String args[])
	{
		Demo dobj=new Demo();
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the N value");
		int size=sobj.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the N elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sobj.nextInt();
		}
		
	    dobj.Display(arr);
		
	}
}

		
		