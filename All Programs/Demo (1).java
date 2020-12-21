// Write a program which calculate the even factorial of number.
// Input : 7
// Output : 2*4*6

// Input : 8
// output : 2*4*6*8

import java.lang.*;
import java.util.*;
class Numbers
{
	int EvenFactorial(int iNo)
	{
		int Fact = 1;
		int iCnt = 2;

		if(iNo < 0)
		{
			iNo = -iNo;
		}
		while(iCnt <= iNo)
		{
			Fact = Fact * iCnt;
			iCnt = iCnt + 2;
		}
		return Fact;
	}
}
class Demo
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number");
		int value = sobj.nextInt();

		Numbers nobj = new Numbers();

		int ret = nobj.EvenFactorial(value);
		System.out.println("Even factortial is : "+ret);
	}
}





