// Accept number from user and return its generic root.
// Generic root mnhnaje number chya digit chi addition jo paranthe single digit nahi yeth tho paranthe kara
// Input 789
// Output : 6 		7+8+9	-> 24 -> 2+4	-> 6
// Input : 9948
// Output : 3 		9+9+4+8	->	30	-> 3+0	-> 3
// Input : 8
// Output : 8	-> 8
// Input :	12	
// Output:  3	-> 1 + 2 -> 3

import java.lang.*;
import java.util.*;

class Digits
{
	int GenericRoot(int ino)
	{
		int isum = 0;
		if(ino < 0)
		{
			ino = -ino;
		}

		isum = ino;	

		while(isum > 9)	
		{
			ino = isum;	
			isum = 0;
			while(ino != 0)
			{
				isum = isum + (ino % 10);
				ino = ino / 10;
			}
			System.out.println(isum);
		}

		return isum;
	}
}
class Demo
{
	public static void main(String arg[])
	{
		Digits dobj = new Digits();
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter number");
		int value = sobj.nextInt();
		int ret = dobj.GenericRoot(value);
		System.out.println("Generic root is : "+ret);
	}
}

// start : 1
// End 3000





